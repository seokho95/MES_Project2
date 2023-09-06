package com.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.dto.ObtainDTO;
import com.project.mapper.ObtainOrderMapper;
@Service
public class ObtainOrderService {
	private ObtainOrderMapper obtainmapper;
	
	public ObtainOrderService(ObtainOrderMapper obtainmapper) {
		this.obtainmapper = obtainmapper;
	}

	public List<ObtainDTO> obtainAllList() {
		return obtainmapper.obtainAllList();
	}

	public List<ObtainDTO> BusinessAllList() {
		return obtainmapper.BusinessAllList();
	}

	public List<ObtainDTO> ProductionAllList() {
		return obtainmapper.ProductionAllList();
	}
	
	
}
