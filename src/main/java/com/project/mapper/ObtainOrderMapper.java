package com.project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.project.dto.ObtainDTO;
@Mapper
public interface ObtainOrderMapper {

	List<ObtainDTO> obtainAllList();

	List<ObtainDTO> BusinessAllList();

	List<ObtainDTO> ProductionAllList();

}
