package com.project.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.project.dto.KongjungDTO;
import com.project.dto.OrderDTO;
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
	
	public void deletekongjung(String processNum) {
		mapper.deletekongjung(processNum);

}


	
	//공정정보 등록
			public void KongjungInsert(KongjungDTO dto) {
				 try {
			            // KongjungDTO에서 데이터 추출
					 	String processNum = dto.getProcessNum();
			            String processName = dto.getProcessName();
			            String materialNo = dto.getMaterialNo();

			            mapper.KongjungInsert(processNum, processName, materialNo);
			       

			        } catch (Exception e) {
			            throw new RuntimeException("데이터 삽입 중 오류 발생", e);
			        }
			  }


			public KongjungDTO editKongjung(String p_num) {
				return mapper.editKongjung(p_num);
			}


			

	

}