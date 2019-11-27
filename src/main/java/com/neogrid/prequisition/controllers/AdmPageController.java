package com.neogrid.prequisition.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neogrid.prequisition.models.PurchaseRequisition;

@Controller
@RequestMapping("/adm")
public class AdmPageController {
	private PurchaseRequisitionController pr = new PurchaseRequisitionController();
	List<PurchaseRequisition> allPr = new ArrayList<PurchaseRequisition>();

}
