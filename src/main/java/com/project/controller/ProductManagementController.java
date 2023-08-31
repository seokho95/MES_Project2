package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductManagementController {
	
	
	//출하 현황
	@RequestMapping("/ProductManagement")
	public String ProductMemanagement() {
		return "ProductManagement/productmanagement";
	}
	//출하등록
	@RequestMapping("/AddProductConsignment")
	public String AddProductConsignment() {
		return "ProductManagement/addproductconsignment";
	}
	//출고요청
	@RequestMapping("/RequstRelease")
	public String RequstRelease() {
		return "ProductManagement/requstrelease";
	}
	//출하요청
	@RequestMapping("/RequstConsignment")
	public String RequstConsignment() {
		return "ProductManagement/requstconsignment";
	}
	
}
