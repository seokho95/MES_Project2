package com.project.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.project.dto.LoginDTO;
import com.project.mapper.LoginMapper;

@Service
public class LoginService {
	private static LoginMapper mapper;

	public LoginService(LoginMapper mapper) {
		this.mapper = mapper;
	}

	public LoginDTO login(String userId, String passwd) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", userId);
		map.put("passwd", passwd);

		return mapper.login(map);
	}
}
