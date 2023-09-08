package com.project.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	public List<ObtainDTO> SearchProduction(String kind, String search) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("kind", kind);
		map.put("search", search);
		return obtainmapper.SearchProduction(map);
	}

	public int countAllOrderProduct() {
		return obtainmapper.countAllOrderProduct();
	}

	public int countAllOrderProduct1() {
		return obtainmapper.countAllOrderProduct1();
	}
	public int countAllOrderProduct2() {
		return obtainmapper.countAllOrderProduct2();
	}

	public int deleteProduction(List<String> pNum) {
		return obtainmapper.DeleteProduction(pNum);
	}

//	public ObtainDTO ModiWriteProduction(String pNum) {
//		return obtainmapper.ModiWriteProduction(pNum);
//	}
	
	
}
