package com.project.dto;

import org.apache.ibatis.type.Alias;

@Alias("product")
public class Stock_ProductDTO {
	private String p_num;
	private String p_name;
	private int p_amount;
	private String recipe_num;
	
	public Stock_ProductDTO(String p_num, String p_name, int p_amount, String recipe_num) {
		this.p_num = p_num;
		this.p_name = p_name;
		this.p_amount = p_amount;
		this.recipe_num = recipe_num;
	}

	public Stock_ProductDTO() {}

	
	
	public String getP_num() {
		return p_num;
	}

	public void setP_num(String p_num) {
		this.p_num = p_num;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public int getP_amount() {
		return p_amount;
	}

	public void setP_amount(int p_amount) {
		this.p_amount = p_amount;
	}

	public String getRecipe_num() {
		return recipe_num;
	}

	public void setRecipe_num(String recipe_num) {
		this.recipe_num = recipe_num;
	}

	@Override
	public String toString() {
		return "Stock_ProductDTO [p_num=" + p_num + ", p_name=" + p_name + ", p_amount=" + p_amount + ", recipe_num="
				+ recipe_num + "]";
	}

	
	
	
}
