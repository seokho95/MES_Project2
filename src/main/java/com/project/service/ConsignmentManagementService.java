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

	// 출하정보 전체리스트
	public List<ConsignmentManagementDTO> ConsignmentManagement() {
		return mapper.ConsignmentManagement();
	}

	// 수주 조회
	public ConsignmentManagementDTO obtainorderSearch(String obtainordersearch) {
		return mapper.obtainorderSearch(obtainordersearch);
	}

	public int AllConsignment() {
		return mapper.AllConsignment();
	}

	public int WaitingCount() {
		return mapper.WaitingCount();
	}

	public int ProdeedingCount() {
		return mapper.ProdeedingCount();
	}

	public int CompletedCount() {
		return mapper.CompletedCount();
	}

	public List<ConsignmentManagementDTO> searchconsignmentdate(String startDate, String endDate, String cnumSearch) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("startDate", startDate);
		map.put("endDate", endDate);
		map.put("cnumSearch", cnumSearch);

		return mapper.searchconsignmentdate(map);
	}

	public List<ConsignmentManagementDTO> searchCnum(String cnumSearch) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("cnumSearch", cnumSearch);
		return mapper.searchCnum(map);
	}

	public void deleteconsignment(String shipNum) {
			mapper.deleteconsignment(shipNum);

	}
}
