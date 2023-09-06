package com.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.dto.KongjungDTO;
import com.project.mapper.KongjungMapper;



@Service
public class KongjungService {
	  	private KongjungMapper mapper;
	  		
	public KongjungService(KongjungMapper mapper) {
			this.mapper = mapper;
		}


	public List<KongjungDTO> selectAllList(KongjungDTO kongjungDTO) {
		return mapper.selectAllList(kongjungDTO);
	}
	

}