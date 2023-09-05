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
	public String ConsignmentManagement() {
		return "consignmentmanagement/productmanagement";
	}
	
	// 출하등록
	@RequestMapping("/AddProductConsignment")
	public String AddProductConsignment() {
		return "consignmentmanagement/addproductconsignment";
	}

	// 수주 리스트 조회
	@RequestMapping("AddProductConsignment/orderlist")
	public ModelAndView userList(ModelAndView view) {
		List<ConsignmentManagementDTO> list = consignmentManagementService.vieworderlist();
		System.out.println(list);
		System.out.println(view);
		view.addObject("list", list);
		view.setViewName("consignmentmanagement/addproductconsignment");
		return view;
	}

	//기사연락처 리스트
	@RequestMapping("AddProductConsignment/driverlist")
	public String ConsumerList() {
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
