package com.project.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.project.dto.ConsignmentManagementDTO;
import com.project.dto.DriverDTO;

@Mapper
public interface ConsignmentManagementMapper {

	//출하정보 전체리스트
	List<ConsignmentManagementDTO> ConsignmentManagement();
	//수주 조회
	ConsignmentManagementDTO obtainorderSearch(String obtainordersearch);
	//기사리스트 전체조회
	List<DriverDTO> DriverList(Map<String, Object> map);
	
	
}
