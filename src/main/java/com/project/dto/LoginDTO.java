package com.project.dto;

import org.apache.ibatis.type.Alias;

@Alias("user")
public class LoginDTO {
	private String userId;
	private String passwd;
	private String name;
	
	public LoginDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getuserId() {
		return userId;
	}

	public void setuserId(String userId) {
		this.userId = userId;
	}

	public String getpasswd() {
		return passwd;
	}

	public void setpasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LoginDTO(String userId, String passwd, String name) {
		super();
		this.userId = userId;
		this.passwd = passwd;
		this.name = name;
	}

	@Override
	public String toString() {
		return "LoginDTO [userId=" + userId + ", passwd=" + passwd + ", name=" + name + "]";
	}
	
	

}
