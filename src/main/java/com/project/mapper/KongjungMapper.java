package com.project.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.project.dto.KongjungDTO;

@Mapper		// Mapper라고 선언함
public interface KongjungMapper {
	// 여기서 지정한 메서드의 이름은 쿼리의 이름과 동일해야 함 (selectBoardList)
	
	
		

		List<KongjungDTO> selectAllList(KongjungDTO kongjungDTO);
		
		List<KongjungDTO> selectAllList1(KongjungDTO kongjungDTO);

		List<KongjungDTO> selectSearch(Map<String, Object> map);

		List<KongjungDTO> selectSearch1(String search);
		
		void deleteKongjung(Long id);

}
