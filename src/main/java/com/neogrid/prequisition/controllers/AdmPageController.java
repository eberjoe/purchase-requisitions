package com.neogrid.prequisition.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neogrid.prequisition.models.PurchaseRequisition;
import com.neogrid.prequisition.repositories.PurchaseRequisitionRepository;

@Controller
public class AdmPageController {
	@Autowired
	private PurchaseRequisitionRepository repository;
	
	@RequestMapping("/adm")
	public String getPrs(Model model) throws Exception {
		List<PurchaseRequisition> prs = new ArrayList<PurchaseRequisition>();
		String msg = "Oi oi oi";
		prs = repository.findAll();
		model.addAllAttributes(prs);
		model.addAttribute("mesg", msg);
		return "adm-page";
	}
		
}
