package com.project.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.project.dto.LoginDTO;

@Mapper
public interface LoginMapper {
	LoginDTO login(Map<String , Object> map);
	
}
