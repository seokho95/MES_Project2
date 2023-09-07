package com.project.dto;

import java.util.Date;

import org.apache.ibatis.type.Alias;
@Alias("production")
public class ProductionDTO {
	private String pNum;
	private int orderNum;
	private String productName;
	private String cNum;
	private Date dateRegister;
	private Date dateFinish;
	private	int amount;
	private	int price;
	private String boxCount;
	private String phase;
	
	public ProductionDTO() {

	}

	public ProductionDTO(String pNum, int orderNum, String productName, String cNum, Date dateRegister, Date dateFinish,
			int amount, int price, String boxCount, String phase) {
		super();
		this.pNum = pNum;
		this.orderNum = orderNum;
		this.productName = productName;
		this.cNum = cNum;
		this.dateRegister = dateRegister;
		this.dateFinish = dateFinish;
		this.amount = amount;
		this.price = price;
		this.boxCount = boxCount;
		this.phase = phase;
	}

	public String getpNum() {
		return pNum;
	}

	public void setpNum(String pNum) {
		this.pNum = pNum;
	}

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getcNum() {
		return cNum;
	}

	public void setcNum(String cNum) {
		this.cNum = cNum;
	}

	public Date getDateRegister() {
		return dateRegister;
	}

	public void setDateRegister(Date dateRegister) {
		this.dateRegister = dateRegister;
	}

	public Date getDateFinish() {
		return dateFinish;
	}

	public void setDateFinish(Date dateFinish) {
		this.dateFinish = dateFinish;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBoxCount() {
		return boxCount;
	}

	public void setBoxCount(String boxCount) {
		this.boxCount = boxCount;
	}

	public String getPhase() {
		return phase;
	}

	public void setPhase(String phase) {
		this.phase = phase;
	}

	@Override
	public String toString() {
		return "ProductionDTO [pNum=" + pNum + ", orderNum=" + orderNum + ", productName=" + productName + ", cNum="
				+ cNum + ", dateRegister=" + dateRegister + ", dateFinish=" + dateFinish + ", amount=" + amount
				+ ", price=" + price + ", boxCount=" + boxCount + ", phase=" + phase + "]";
	}

	
	
	
	
	
}
	