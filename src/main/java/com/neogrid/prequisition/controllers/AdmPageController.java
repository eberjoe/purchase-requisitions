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
	private String[] header = {"ID", "Item", "Número", "Quantidade", "Valor"};
	
	@RequestMapping("/adm")
	public String getPrs(Model model) throws Exception {
		List<PurchaseRequisition> prs = new ArrayList<PurchaseRequisition>();
		prs = repository.findAll();
		model.addAttribute("cabecalho", header);
		model.addAttribute("prs", prs);
		return "adm-page";
	}
		
}
