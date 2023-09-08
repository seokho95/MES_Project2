package com.project.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.project.dto.ObtainDTO;
@Mapper
public interface ObtainOrderMapper {

	List<ObtainDTO> obtainAllList();

	List<ObtainDTO> BusinessAllList();

	List<ObtainDTO> ProductionAllList();

	List<ObtainDTO> SearchProduction(Map<String, Object>map);

	int countAllOrderProduct();

	int countAllOrderProduct1();

	int countAllOrderProduct2();

	int DeleteProduction(List<String> pNum);

	//ObtainDTO ModiWriteProduction(String pNum);

}
