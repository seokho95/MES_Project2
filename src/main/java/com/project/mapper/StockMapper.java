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

	int InsertMaterial(Stock_MaterialDTO dto);

	int InsertProduct(Stock_ProductDTO dto);

	Stock_MaterialDTO SelectMaterial(String m_num);

	int UpdateMaterial(Stock_MaterialDTO dto);

	Stock_ProductDTO SelectProduct(String p_num);

	int UpdateProduct(Stock_ProductDTO dto);

}
