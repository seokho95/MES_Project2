package com.project.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
		int countAllOrderProduct = obtainService.countAllOrderProduct();
		int countAllOrderProduct1 = obtainService.countAllOrderProduct1();
		int countAllOrderProduct2 = obtainService.countAllOrderProduct2();
		view.addObject("countAllOrderProduct",countAllOrderProduct);
		view.addObject("countAllOrderProduct1",countAllOrderProduct1);
		view.addObject("countAllOrderProduct2",countAllOrderProduct2);
		view.addObject("list", list);
		view.setViewName("obtainorder/production_info");
		return view;
	}
	@RequestMapping("/production/search")
	public ResponseEntity<String> searchProduction(String kind, String search){
		List<ObtainDTO> list = obtainService.SearchProduction("p."+kind, search);
		return new ResponseEntity(list, HttpStatus.OK);
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
//	//제품리스트클릭
//	@RequestMapping("/production/detail/{pNum}")
//	public ModelAndView detail(@PathVariable String pNum, ModelAndView view) {
//		ObtainDTO dto = obtainService.ModiWriteProduction(pNum);
//		System.out.println(dto);
//		view.addObject("sell", dto);
//		view.setViewName("obtainorder/production_info_modi");
//		return view;
//	}
//	@RequestMapping("/product/update")
//	public String update(ObtainDTO dto) {
//		obtainService.updateProduction(dto);
//		return "redirect:/main";
//	}
	
	@RequestMapping("/production/delete/{pNum}")
	public ResponseEntity<String> delete(@PathVariable String pNum){
		int result = obtainService.deleteProduction(pNum);
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("count", result);
		System.out.println(result);
		if(result == 0)
			map.put("message", "데이터 삭제 실패");
		else
			map.put("message", "데이터 삭제 성공");
		
		return new ResponseEntity(map,HttpStatus.OK);
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
