package com.project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.project.dto.KongjungDTO;

@Mapper		// Mapper라고 선언함
public interface KongjungMapper {
	// 여기서 지정한 메서드의 이름은 쿼리의 이름과 동일해야 함 (selectBoardList)
	
	
		

		List<KongjungDTO> selectAllList(KongjungDTO kongjungDTO);

}
