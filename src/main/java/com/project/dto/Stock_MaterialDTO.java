package com.project.dto;

import org.apache.ibatis.type.Alias;

@Alias("material")
public class Stock_MaterialDTO {
	private String m_num;
	private String material_name;
	private int m_count;
	private int m_box_count;
	private String m_unit;
	
	public Stock_MaterialDTO(String m_num, String material_name, int m_count, int m_box_count, String m_unit) {
		this.m_num = m_num;
		this.material_name = material_name;
		this.m_count = m_count;
		this.m_box_count = m_box_count;
		this.m_unit = m_unit;
	}

	public Stock_MaterialDTO() {}

	public String getM_num() {
		return m_num;
	}

	public void setM_num(String m_num) {
		this.m_num = m_num;
	}

	public String getMaterial_name() {
		return material_name;
	}

	public void setMaterial_name(String material_name) {
		this.material_name = material_name;
	}

	public int getM_count() {
		return m_count;
	}

	public void setM_count(int m_count) {
		this.m_count = m_count;
	}

	public int getM_box_count() {
		return m_box_count;
	}

	public void setM_box_count(int m_box_count) {
		this.m_box_count = m_box_count;
	}

	public String getM_unit() {
		return m_unit;
	}

	public void setM_unit(String m_unit) {
		this.m_unit = m_unit;
	}

	@Override
	public String toString() {
		return "Stock_MaterialDTO [m_num=" + m_num + ", material_name=" + material_name + ", m_count=" + m_count
				+ ", m_box_count=" + m_box_count + ", m_unit=" + m_unit + "]";
	}
	
	
	
	
	
	
}
