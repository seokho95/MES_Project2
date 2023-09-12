package com.project.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
		int waitingcount = consignmentManagementService.WaitingCount();
		int proceedingcount = consignmentManagementService.ProdeedingCount();
		int completedcount = consignmentManagementService.CompletedCount();
		System.out.println(list);
		view.addObject("allcount", allcount);
		view.addObject("waitingcount", waitingcount);
		view.addObject("proceedingcount", proceedingcount);
		view.addObject("completedcount", completedcount);
		view.addObject("all_consignmentlist", list);
		view.setViewName("consignmentmanagement/productmanagement");
		return view;
	}

	// 날자+수주번호 검색
	@RequestMapping("/ConsignmentManagement/search")
	public ResponseEntity<List<ConsignmentManagementDTO>> searchconsignmentdate(
			@RequestParam(name = "startDate", required = false) String startDate,
			@RequestParam(name = "endDate", required = false) String endDate,
			@RequestParam(name = "cnumSearch") String cnumSearch) {
		List<ConsignmentManagementDTO> consignmentList;
		System.out.println(startDate);
		System.out.println(endDate);
		System.out.println(cnumSearch);
		// null이 아닌 ""빈문자열로 지정해줘야한다.
		if (startDate != "" && endDate != "") {
			consignmentList = consignmentManagementService.searchconsignmentdate(startDate, endDate, cnumSearch);
		} else {
			consignmentList = consignmentManagementService.searchCnum(cnumSearch);
		}
		System.out.println(consignmentList);
		return new ResponseEntity<>(consignmentList, HttpStatus.OK);
	}

	// 선택 항목 삭제
	@RequestMapping("/ConsignmentManagement/delete/{shipNum}")
	public ResponseEntity<String> deleteconsignment(@PathVariable("shipNum") String shipNum) {
		System.out.println(shipNum);
		consignmentManagementService.deleteconsignment(shipNum);
		System.out.println(shipNum);

		return new ResponseEntity("선택항목을 삭제했습니다.",HttpStatus.OK);
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

	// 기사연락처 리스트조회 및 검색기능
	@ResponseBody
	@RequestMapping("/AddProductConsignment/driverlist")
	// @RequestParam(name="driverCode",defaultValue = "")→name의 값은 driverCode 값이 없으면
	// ""으로 표시
	public List<DriverDTO> DriverList(@RequestParam(name = "search", defaultValue = "") String search,
			@RequestParam(name = "kind", defaultValue = "d_contact") String kind) {
		// kind=카테고리값 search=검색값
		System.out.println("search:" + search);
		System.out.println(kind);
		List<DriverDTO> driverlist = driverService.DriverList(kind, search);
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
