package com.project.dto;

import org.apache.ibatis.type.Alias;

@Alias("Driver")
public class DriverDTO {
	private int dNum;
	private String dContact;
	
	public DriverDTO() {
	}
	
	public DriverDTO(int dNum, String dContact) {
		this.dNum = dNum;
		this.dContact = dContact;
	}

	

	public int getdNum() {
		return dNum;
	}

	public void setdNum(int dNum) {
		this.dNum = dNum;
	}

	public String getdContact() {
		return dContact;
	}

	public void setdContact(String dContact) {
		this.dContact = dContact;
	}

	@Override
	public String toString() {
		return "DriverDTO [dNum=" + dNum + ", dContact=" + dContact + "]";
	}
}
