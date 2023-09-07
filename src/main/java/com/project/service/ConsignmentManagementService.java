package com.project.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.project.dto.ConsignmentManagementDTO;
import com.project.mapper.ConsignmentManagementMapper;

@Service
public class ConsignmentManagementService {
	private ConsignmentManagementMapper mapper;

	public ConsignmentManagementService(ConsignmentManagementMapper mapper) {
		this.mapper = mapper;
	}
	//출하정보 전체리스트
	public List<ConsignmentManagementDTO> ConsignmentManagement() {
		return mapper.ConsignmentManagement();
	}
	//수주 조회
	public ConsignmentManagementDTO obtainorderSearch(String obtainordersearch) {
		return mapper.obtainorderSearch(obtainordersearch);
	}
	
	
}
