package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ObtainOrderController {
	
	
	//수주조회
	@RequestMapping("/ObtainOrder")
	public String ObtainOrder() {
		return "obtainorder/obtain_order";
	}
	//수주등록
	@RequestMapping("/ObtainOrderUpload")
	public String ObtainOrderUpload() {
		return "obtainorder/obtain_order_upload";
	}
	//수주수정
	@RequestMapping("/ObtainOrderModi")
	public String ObtainOrderModi() {
		return "obtainorder/obtain_order_modi";
	}
	//제품조회
	@RequestMapping("/ProductionInfo")
	public String ProductionInfo() {
		return "obtainorder/production_info";
	}
	//제품등록
	@RequestMapping("/ProductionInfoUpload")
	public String ProductionInfoUpload() {
		return "obtainorder/production_info_upload";
	}
	//제품수정
	@RequestMapping("/ProductionInfoModi")
	public String ProductionInfoModi() {
		return "obtainorder/production_info_modi";
	}
	//고객업체 조회
	@RequestMapping("/BusinessInfo")
	public String BusinessInfo() {
		return "obtainorder/business_info";
	}
	//고객업체 등록
		@RequestMapping("/BusinessInfoUpload")
		public String BusinessInfoUpload() {
			return "obtainorder/business_info_upload";
	}
    //고객업체 수정
	@RequestMapping("/BusinessInfoModi")
	public String BusinessInfoModi() {
			return "obtainorder/business_info_modi";
	}	
	
}
