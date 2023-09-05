package com.project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.project.dto.Stock_MaterialDTO;
import com.project.dto.Stock_ProductDTO;

@Mapper
public interface StockMapper {

	List<Stock_MaterialDTO> selectAllMaterial();

	int countAllMaterial();

	List<Stock_ProductDTO> selectAllProduct();

	int countAllProduct();

}
