package com.project.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.dto.Stock_MaterialDTO;
import com.project.dto.Stock_ProductDTO;
import com.project.service.StockService;

@Controller
public class StockController {

	private StockService service;
	
	public StockController(StockService service) {
		this.service = service;
	}

	@RequestMapping("/stock/material")
	public ModelAndView ViewAllMaterial(ModelAndView view) {
		List<Stock_MaterialDTO> list = service.selectAllMaterial();
		int count = service.countAllMaterial();
		view.addObject("count",count);
		view.addObject("list",list);
		view.setViewName("stock/stock_material");
		return view;
	}
	
	@RequestMapping("/stock/product")
	public ModelAndView ViewAllProduct(ModelAndView view) {
		List<Stock_ProductDTO> list = service.selectAllProduct();
		int count = service.countAllProduct();
		view.addObject("count",count);
		view.addObject("list",list);
		view.setViewName("stock/stock_product");
		return view;
	}
	
}
