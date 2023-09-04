package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {
	
	
	//협력업체 조회
	@RequestMapping("/Contractor")
	public String Contractor() {
		return "order/contractor";
	}
	//협력업체 등록
	@RequestMapping("/ContractorRegister")
	public String ContractorRegister() {
		return "order/contractorRegister";
	}
	//협럭업체 수정
	@RequestMapping("ContractorEdit")
	public String ContractorEdit() {
		return "order/contractorEdit";
	}
	//원부재료 조회
	@RequestMapping("MaterialInfo")
	public String MaterialInfo() {
		return "order/materialInfo";
	}
	//원부재료 등록
	@RequestMapping("MaterialRegister")
	public String MaterialRegister() {
		return "order/material_register";
	}
	//원부재료 수정
	@RequestMapping("/MaterialEdit")
	public String MaterialEdit() {
		return "order/material_edit";
	}
	//발주관리 조회
	@RequestMapping("/Order")
	public String Oder() {
		return "order/order";
	}
	//발주관리 수정
		@RequestMapping("/OrderRgisterEdit")
		public String OrderRgisterEdit() {
			return "order/order_register_edit";
	}
    //발주관리 등록
	@RequestMapping("/OrderRegister")
	public String OderRegister() {
			return "order/order_register";
	}	
	
}
