package com.project.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.project.dto.ProductionDTO;

@Mapper
public interface ProductionMapper {

	List<ProductionDTO> selectAll();
	
	List<ProductionDTO> selectProduction(Map<String, Object> map);

	List<ProductionDTO> register(ProductionDTO productDTO);


}
