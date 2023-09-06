package com.project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.project.dto.ConsignmentManagementDTO;

@Mapper
public interface ConsignmentManagementMapper {

	//출하정보 전체리스트
	List<ConsignmentManagementDTO> ConsignmentManagement();
	
	
}
