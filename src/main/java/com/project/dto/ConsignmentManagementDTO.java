package com.project.dto;

import org.apache.ibatis.type.Alias;

@Alias("Consignment")
public class ConsignmentManagementDTO {
	private String sNum; //수주번호
	private String dateOrder; //수주 접수 일자
	private String dateToArrive; //납기 일자
	private String cNum; // 사업자번호
	private String address; // 주소
	private String pNum;//품목번호
	private int sAmount; //요청수량
	private String dateStartShip; //출하 시작일
	private int shipAmount; //출하 수량
	private int dNum; // 기사번호
	private String shipNum; //출하코드
	private String sPhase; //출하현황 
	
	public ConsignmentManagementDTO() {
	}
	
	
	//수주리스트
	public ConsignmentManagementDTO(String sNum, String dateOrder, String dateToArrive, String cNum, String address,
			String pNum, int sAmount) {
		this.sNum = sNum;
		this.dateOrder = dateOrder;
		this.dateToArrive = dateToArrive;
		this.cNum = cNum;
		this.address = address;
		this.pNum = pNum;
		this.sAmount = sAmount;
	}
	//기사번호
	public ConsignmentManagementDTO(int dNum) {
		this.dNum = dNum;
	}
	
	
	//전체조회
	public ConsignmentManagementDTO(String sNum, String dateOrder, String dateToArrive, String cNum, String address,
			String pNum, int sAmount, int dNum, String shipNum, String dateStartShip, int shipAmount, String sPhase) {
		this.sNum = sNum;
		this.dateOrder = dateOrder;
		this.dateToArrive = dateToArrive;
		this.cNum = cNum;
		this.address = address;
		this.pNum = pNum;
		this.sAmount = sAmount;
		this.dNum = dNum;
		this.shipNum = shipNum;
		this.dateStartShip = dateStartShip;
		this.shipAmount = shipAmount;
		this.sPhase = sPhase;
	}

	

	@Override
	public String toString() {
		return "ConsignmentManagementDTO [sNum=" + sNum + ", dateOrder=" + dateOrder + ", dateToArrive=" + dateToArrive
				+ ", cNum=" + cNum + ", address=" + address + ", pNum=" + pNum + ", sAmount=" + sAmount + ", dNum="
				+ dNum + ", shipNum=" + shipNum + ", dateStartShip=" + dateStartShip + ", shipAmount=" + shipAmount
				+ ", sPhase=" + sPhase + "]";
	}


	public String getsNum() {
		return sNum;
	}


	public void setsNum(String sNum) {
		this.sNum = sNum;
	}


	public String getDateOrder() {
		return dateOrder;
	}


	public void setDateOrder(String dateOrder) {
		this.dateOrder = dateOrder;
	}


	public String getDateToArrive() {
		return dateToArrive;
	}


	public void setDateToArrive(String dateToArrive) {
		this.dateToArrive = dateToArrive;
	}


	public String getcNum() {
		return cNum;
	}


	public void setcNum(String cNum) {
		this.cNum = cNum;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getpNum() {
		return pNum;
	}


	public void setpNum(String pNum) {
		this.pNum = pNum;
	}


	public int getsAmount() {
		return sAmount;
	}


	public void setsAmount(int sAmount) {
		this.sAmount = sAmount;
	}


	public String getDateStartShip() {
		return dateStartShip;
	}


	public void setDateStartShip(String dateStartShip) {
		this.dateStartShip = dateStartShip;
	}


	public int getShipAmount() {
		return shipAmount;
	}


	public void setShipAmount(int shipAmount) {
		this.shipAmount = shipAmount;
	}


	public int getdNum() {
		return dNum;
	}


	public void setdNum(int dNum) {
		this.dNum = dNum;
	}


	public String getShipNum() {
		return shipNum;
	}


	public void setShipNum(String shipNum) {
		this.shipNum = shipNum;
	}


	public String getsPhase() {
		return sPhase;
	}


	public void setsPhase(String sPhase) {
		this.sPhase = sPhase;
	}
	
	
	
	

	
	
}
