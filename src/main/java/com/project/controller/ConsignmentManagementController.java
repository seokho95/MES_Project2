package com.project.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.dto.ConsignmentManagementDTO;
import com.project.service.ConsignmentManagementService;

@Controller
public class ConsignmentManagementController {

	private ConsignmentManagementService consignmentManagementService;

	public ConsignmentManagementController(ConsignmentManagementService consignmentManagementService) {
		this.consignmentManagementService = consignmentManagementService;
	}

	// 출하 현황
	@RequestMapping("/ConsignmentManagement")
	public ModelAndView ConsignmentManagement(ModelAndView view) {
		List<ConsignmentManagementDTO> list = consignmentManagementService.ConsignmentManagement();
		System.out.println(list);
		view.addObject("all_consignmentlist", list);
		view.setViewName("consignmentmanagement/productmanagement");
		return view;
	}

	// 출하등록
	@RequestMapping("/AddProductConsignment")
	public String AddProductConsignment() {
		return "consignmentmanagement/addproductconsignment";
	}

	// 기사연락처 리스트
	@RequestMapping("/AddProductConsignment/driverlist")
	public String driverList() {
		return "consignmentmanagement/driverlist";
	}

	// 출고요청
	@RequestMapping("/RequstRelease")
	public String RequstRelease() {
		return "consignmentmanagement/requstrelease";
	}

	// 출하요청
	@RequestMapping("/RequstConsignment")
	public String RequstConsignment() {
		return "consignmentmanagement/requstconsignment";
	}

}
