package com.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.dto.ConsignmentManagementDTO;
import com.project.mapper.ConsignmentManagementMapper;

@Service
public class ConsignmentManagementService {
	private ConsignmentManagementMapper mapper;

	public ConsignmentManagementService(ConsignmentManagementMapper mapper) {
		this.mapper = mapper;
	}

	public List<ConsignmentManagementDTO> ConsignmentManagement() {
		return mapper.ConsignmentManagement();
	}
	
	
}
