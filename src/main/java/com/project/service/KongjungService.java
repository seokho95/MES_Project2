package com.project.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	public List<KongjungDTO> selectSearch(String search) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("search", search);
		return mapper.selectSearch(map);
	}
	
	public List<KongjungDTO> selectAllList1 (KongjungDTO kongjungDTO) {
		return mapper.selectAllList1(kongjungDTO);
	}
	
	public List<KongjungDTO> selectSearch1(String search) {
		
		return mapper.selectSearch1(search);
	}
	
	// 선택된 항목을 삭제하는 메서드
    public boolean deleteSelected(List<Long> selectedIds) {
        try {
            for (Long id : selectedIds) {
                mapper.deleteKongjung(id);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
	

}