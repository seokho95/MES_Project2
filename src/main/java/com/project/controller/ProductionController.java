package com.project.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.dto.ProductionDTO;
import com.project.service.ProductionService;

@Controller
public class ProductionController {
	
		private ProductionService productionService;
				
	public ProductionController(ProductionService productionService) {
			this.productionService = productionService;
		}
	
	@RequestMapping("/PM")
	public ModelAndView ProductionMain(ModelAndView view) {
		List<ProductionDTO> select_list = productionService.selectAll();
		
		view.setViewName("/production/ProductionMain");
		view.addObject("select_list",select_list);
		
		return view;
	}
	@RequestMapping("/Search")
	public ResponseEntity<String> searchStudent(String search){
		List<ProductionDTO> list = productionService.selectProduction(search);
		return new ResponseEntity(list,HttpStatus.OK);
	}
	@RequestMapping("/PMRegister")
	public ModelAndView register(ModelAndView view, HttpServletRequest request) {
		String dateRegister = request.getParameter("dateRegister");
		String dateFinish = request.getParameter("dateFinish");
		ProductionDTO productionDTO = new ProductionDTO();
		List<ProductionDTO> register = productionService.register(productionDTO);
		view.setViewName("product/ProductRegister");
		return view;
	}
	@RequestMapping("/PMModify")
	public String ProductionModify() {
		return "/production/ProductionModify";
	}
}

