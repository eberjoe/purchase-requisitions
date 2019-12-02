package com.neogrid.prequisition.restcontrollers;

import java.util.List;
import javax.validation.Valid;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.neogrid.prequisition.models.Deleted;
import com.neogrid.prequisition.models.PurchaseRequisition;
import com.neogrid.prequisition.repositories.PurchaseRequisitionRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.neogrid.prequisition.repositories.DeletedRepository;

@Api(value = "Pedidos")
@RestController
@RequestMapping("/rest-pr")
public class PurchaseRequisitionController {
	@Autowired
	private PurchaseRequisitionRepository repository;
	@Autowired
	private DeletedRepository delRepo;
	
	@ApiOperation(value = "Retorna todos as RCs")
	@GetMapping(value = "/all")
	public List<PurchaseRequisition> getAllPrs() {
		return repository.findAll();
	}

	@ApiOperation(value = "Retorna RC a partir do ID")
	@GetMapping
	public PurchaseRequisition getPurchaseRequisitionById(@RequestParam ObjectId id) {
	return repository.findBy_id(id);
	}

	@ApiOperation(value = "Altera uma RC a partir do ID")
	@PutMapping
	public void modifyPurchaseRequisitionById(@RequestParam ObjectId id, @Valid @RequestBody PurchaseRequisition pr) {
		pr.set_id(id);
		repository.save(pr);
	}
	
	@ApiOperation(value = "Insere uma nova RC")
	@PostMapping(value = "/new")
	public PurchaseRequisition createPurchaseRequisition(@Valid @RequestBody PurchaseRequisition pr) {
		pr.set_id(ObjectId.get());
		repository.save(pr);
		return pr;
	}
	
	@ApiOperation(value = "Remove uma RC pelo ID")
	@DeleteMapping
	public void deletePurchaseRequisition(@RequestParam ObjectId id) {
		PurchaseRequisition pr = repository.findBy_id(id);
		delRepo.save(new Deleted(pr.get_id(), pr.getNumero(), pr.getQuantidade(), pr.getValor(), pr.getItem()));
		repository.delete(pr);
	}
	
}
