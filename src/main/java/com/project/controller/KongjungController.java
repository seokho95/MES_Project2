package com.project.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class KongjungController {
	
	@RequestMapping("/kongjunginfo")
	public String KongjungTest() {
		return "kongjung/kongjung_info";
	}
	@RequestMapping("/kongjunginsert")
	public String KongjungInsert() {
		return "kongjung/kongjung_insert";
	}
	@RequestMapping("/kongjungupdate")
	public String KongjungUpdate() {
		return "kongjung/kongjung_update";
	}
	@RequestMapping("/recipeinfo")
	public String RecipeInfo() {
		return "kongjung/recipe_info";
	}
	@RequestMapping("/recipeinsert")
	public String RecipeInsert() {
		return "kongjung/recipe_insert";
	}
	@RequestMapping("/recipeupdate")
	public String RecipeUpdate() {
		return "kongjung/recipe_update";
	}

}