package com.neogrid.prequisition.controllers;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.neogrid.prequisition.models.PurchaseRequisition;
import com.neogrid.prequisition.repositories.PurchaseRequisitionRepository;

import io.micrometer.core.instrument.util.IOUtils;
import io.micrometer.core.ipc.http.HttpSender.Response;

@RestController
@RequestMapping("/PurchaseRequisition")
public class PurchaseRequisitionController {
	@Autowired
	private PurchaseRequisitionRepository repository;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<PurchaseRequisition> getAllPrs() {
		return repository.findAll();
	}

//	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
//	public PurchaseRequisition getPurchaseRequisitionById(@PathVariable("id") ObjectId id) {
//	return repository.findBy_id(id);
//	}

	@RequestMapping(value = "/{numero}", method = RequestMethod.GET)
	public PurchaseRequisition getPurchaseRequisitionByNumero(@PathVariable("numero") Long numero) {
		return repository.findByNumero(numero);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void modifyPurchaseRequisitionById(@PathVariable("id") ObjectId id, @Valid @RequestBody PurchaseRequisition pr) {
		pr.set_id(id);
		repository.save(pr);
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public PurchaseRequisition createPurchaseRequisition(@Valid @RequestBody PurchaseRequisition pr) {
		pr.set_id(ObjectId.get());
		repository.save(pr);
		return pr;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deletePurchaseRequisition(@PathVariable ObjectId id, HttpServletResponse response) {
		PurchaseRequisition pr = repository.findBy_id(id);
		JSONObject json = new JSONObject(pr);
		response.addHeader("Content-disposition", "attachment;filename=myfileName.txt");
		response.setContentType("text/xml");
		repository.delete(pr);
	}
	
}
