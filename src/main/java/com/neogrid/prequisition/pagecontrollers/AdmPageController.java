package com.neogrid.prequisition.pagecontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.neogrid.prequisition.repositories.PurchaseRequisitionRepository;

@Controller
public class AdmPageController {
	@Autowired
	private PurchaseRequisitionRepository repository;
	
	private String[] header = {"ID", "Item", "Número", "Quantidade", "Valor"};
	
	@RequestMapping("/adm")
	public String getPrs(Model model) throws Exception {
		model.addAttribute("cabecalho", header);
		model.addAttribute("prs", repository.findAll());
		return "adm-page";
	}
		
}
