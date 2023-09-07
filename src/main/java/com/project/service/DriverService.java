package com.project.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.project.dto.DriverDTO;
import com.project.mapper.ConsignmentManagementMapper;

@Service
public class DriverService {
	private ConsignmentManagementMapper mapper;
	
	

	

	public DriverService(ConsignmentManagementMapper mapper) {
		super();
		this.mapper = mapper;
	}





	public List<DriverDTO> DriverList(String kind, String search) {
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("search", search);
		map.put("kind", kind);
		return mapper.DriverList(map);
	}

}
 