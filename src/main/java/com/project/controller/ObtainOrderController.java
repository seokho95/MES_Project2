package com.project.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.dto.ObtainDTO;
import com.project.service.ObtainOrderService;

@Controller
public class ObtainOrderController {
	private ObtainOrderService obtainService;
	
	public ObtainOrderController(ObtainOrderService obtainService) {
		this.obtainService = obtainService;
	}
	
	//수주조회
	@RequestMapping("/ObtainOrder")
	public ModelAndView obtainOrderList(ModelAndView view) {
		List<ObtainDTO> list = obtainService.obtainAllList();
		view.addObject("list", list);
		view.setViewName("obtainorder/obtain_order");
		return view;
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
	public ModelAndView ProductionList(ModelAndView view) {
		List<ObtainDTO> list = obtainService.ProductionAllList();
		view.addObject("list", list);
		view.setViewName("obtainorder/production_info");
		return view;
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
	public ModelAndView BusinessList(ModelAndView view) {
		List<ObtainDTO> list = obtainService.BusinessAllList();
		view.addObject("list", list);
		view.setViewName("obtainorder/business_info");
		return view;
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
