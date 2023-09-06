package com.project.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.dto.KongjungDTO;
import com.project.service.KongjungService;

@Controller
public class KongjungController {
	
	private KongjungService kongjungService;
				
	public KongjungController(KongjungService kongjungService) {
			this.kongjungService = kongjungService;
		}
	@RequestMapping("/kongjung_info")     
	public ModelAndView allList(KongjungDTO kongjungDTO , ModelAndView view)  {
		List<KongjungDTO> List = kongjungService.selectAllList(kongjungDTO);    //  임시 KongjungService의 seletAllList List로 담음
		System.out.println(List.toString());
		view.addObject("kongjungList",List);	
		view.setViewName("/kongjung/kongjung_info");
	return view;                      
	}

	
	@RequestMapping("/kongjung_insert")
	public String KongjungTest1() {
		return "kongjung_insert";
	}
	@RequestMapping("/kongjung_update")
	public String KongjungTest2() {
		return "kongjung_update";
	}
	@RequestMapping("/recipe")
	public String RecipeTest() {
		return "recipe_info";
	}
	@RequestMapping("/recipe1")
	public String RecipeTest1() {
		return "recipe_insert";
	}
	@RequestMapping("/recipe2")
	public String RecipeTest2() {
		return "recipe_update";
	}

}