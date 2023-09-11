package com.project.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.project.dto.ConsignmentManagementDTO;
import com.project.dto.DriverDTO;
import com.project.service.ConsignmentManagementService;
import com.project.service.DriverService;

@Controller
public class ConsignmentManagementController {

	private ConsignmentManagementService consignmentManagementService;
	private DriverService driverService;


	public ConsignmentManagementController(ConsignmentManagementService consignmentManagementService,
			DriverService driverService) {
		super();
		this.consignmentManagementService = consignmentManagementService;
		this.driverService = driverService;
	}

	// 출하 현황
	@RequestMapping("/ConsignmentManagement")
	public ModelAndView ConsignmentManagement(ModelAndView view) {
		List<ConsignmentManagementDTO> list = consignmentManagementService.ConsignmentManagement();
		int allcount = consignmentManagementService.AllConsignment();
		System.out.println(list);
		view.addObject("allcount",allcount);
		view.addObject("all_consignmentlist", list);
		view.setViewName("consignmentmanagement/productmanagement");
		return view;
	}

	// 출하등록 - view
	@RequestMapping("/AddProductConsignment")
	public String AddProductConsignment() {
		return "consignmentmanagement/addproductconsignment";
	}

	// 수주리스트 검색해서 innerHtml로 입력바로 받기
	@ResponseBody
	@RequestMapping(value = "/AddProductConsignment/Obtainordersearch", method = RequestMethod.POST)
	public ConsignmentManagementDTO obtainorderSearch(String obtainordersearch) {
		ConsignmentManagementDTO dto = consignmentManagementService.obtainorderSearch(obtainordersearch);
		System.out.println(dto);
		return dto;
	}

	// 기사연락처 리스트조회 및 검색기능 같이 묶어서 실행
	@ResponseBody
	@RequestMapping("/AddProductConsignment/driverlist")
	//@RequestParam(name="driverCode",defaultValue = "")→name의 값은 driverCode 값이 없으면 ""으로 표시
	public List<DriverDTO> DriverList(@RequestParam(name="search",defaultValue = "") String search,
			@RequestParam(name="kind",defaultValue = "d_contact") String kind) {
		System.out.println("search:"+search);
		System.out.println(kind);
		List<DriverDTO> driverlist = driverService.DriverList(kind,search);
		System.out.println(driverlist);
		
		return driverlist;
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
