package com.project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.project.dto.ConsignmentManagementDTO;

@Mapper
public interface ConsignmentManagementMapper {

	List<ConsignmentManagementDTO> vieworderlist();
	
	
}
