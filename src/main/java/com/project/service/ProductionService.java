package com.project.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.project.dto.ProductionDTO;
import com.project.mapper.ProductionMapper;

@Service
public class ProductionService {
	
	private ProductionMapper productionMapper;

	public ProductionService(ProductionMapper productionMapper) {
		this.productionMapper = productionMapper;
	}
	
	public List<ProductionDTO> selectAll() {
		return productionMapper.selectAll();
	}

	public List<ProductionDTO> selectProduction(String search) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("search", search);
		return productionMapper.selectProduction(map);
	}

	public List<ProductionDTO> register(ProductionDTO productionDTO) {
		return productionMapper.register(productionDTO);
	}

	

	
	
	
}
