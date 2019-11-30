package com.neogrid.prequisition.controllers;

import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.neogrid.prequisition.models.Deleted;
import com.neogrid.prequisition.repositories.DeletedRepository;

@RestController
@RequestMapping("/rest-deleted")
public class DeletedController {
	@Autowired
	private DeletedRepository delRepo;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<String> getAllDeleted() {
		List<String> ids = new ArrayList<String>();
		for (Deleted i: delRepo.findAll()) {
			ids.add(i.getId());
		}
		return ids;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
	public Deleted getDeletedById(@PathVariable("id") ObjectId id) {
		return delRepo.findById(id);
	}

}
