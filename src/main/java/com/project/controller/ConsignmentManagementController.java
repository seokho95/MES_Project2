package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConsignmentManagementController {
	
	
	//출하 현황
	@RequestMapping("/ConsignmentManagement")
	public String ConsignmentManagement() {
		return "consignmentmanagement/productmanagement";
	}
	//출하등록
	@RequestMapping("/AddProductConsignment")
	public String AddProductConsignment() {
		return "consignmentmanagement/addproductconsignment";
	}
	//고객사 목록리스트
	@RequestMapping("AddProductConsignment/consumerlist")
	public String ConsumerList() {
		return "consignmentmanagement/consumerlist";
	}
	//품목 리스트 조회
	@RequestMapping("AddProductConsignment/productlist")
	public String ProductList() {
		return "consignmentmanagement/productlist";
	}
	//수주 리스트 조회
	@RequestMapping("AddProductConsignment/orderlist")
	public String OrderList() {
		return "consignmentmanagement/orderlist";
	}
	//출고요청
	@RequestMapping("/RequstRelease")
	public String RequstRelease() {
		return "consignmentmanagement/requstrelease";
	}
	//출하요청
	@RequestMapping("/RequstConsignment")
	public String RequstConsignment() {
		return "consignmentmanagement/requstconsignment";
	}
	
}
