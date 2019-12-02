package com.neogrid.prequisition.restcontrollers;

import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.neogrid.prequisition.models.Deleted;
import com.neogrid.prequisition.repositories.DeletedRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "Deleted")
@RestController
@RequestMapping("/rest-deleted")
public class DeletedController {
	@Autowired
	private DeletedRepository delRepo;
	
	@ApiOperation(value = "Retorna os IDs de todas as RC removidas")
	@GetMapping(value = "/all")
	public List<String> getAllDeleted() {
		List<String> ids = new ArrayList<String>();
		for (Deleted i: delRepo.findAll()) {
			ids.add(i.getId());
		}
		return ids;
	}
	
	@ApiOperation(value = "Retorna RC removida no formato XML a partir do ID")
	@GetMapping(produces = MediaType.APPLICATION_XML_VALUE)
	public Deleted getDeletedById(@RequestParam ObjectId id) {
		return delRepo.findById(id);
	}

}
