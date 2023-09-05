package com.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.dto.Stock_MaterialDTO;
import com.project.dto.Stock_ProductDTO;
import com.project.mapper.StockMapper;

@Service
public class StockService {

	private StockMapper mapper;
	
	public StockService(StockMapper mapper) {
		this.mapper = mapper;
	}





	public List<Stock_MaterialDTO> selectAllMaterial() {
		return mapper.selectAllMaterial();
	}





	public int countAllMaterial() {
		return mapper.countAllMaterial();
	}





	public List<Stock_ProductDTO> selectAllProduct() {
		return mapper.selectAllProduct();
	}





	public int countAllProduct() {
		return mapper.countAllProduct();
	}




}
