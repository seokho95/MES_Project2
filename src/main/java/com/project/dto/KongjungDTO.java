package com.project.dto;

import org.apache.ibatis.type.Alias;

@Alias("process")
public class KongjungDTO {
   
	 /* 공정관리 */
	   private String processNum;
	   private String processName;
	   
	   
	public KongjungDTO() {
	}
	
	
	public KongjungDTO(String processNum, String processName) {
		this.processNum = processNum;
		this.processName = processName;
	}
	
	
	public String getProcessNum() {
		return processNum;
	}
	public void setProcessNum(String processNum) {
		this.processNum = processNum;
	}
	public String getProcessName() {
		return processName;
	}
	public void setProcessName(String processName) {
		this.processName = processName;
	}
	
	
	@Override
	public String toString() {
		return "KongjungDTO [processNum=" + processNum + ", processName=" + processName + "]";
	}
		

	    

	  
	}