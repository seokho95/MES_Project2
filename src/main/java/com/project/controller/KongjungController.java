package com.project.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
		view.addObject("kongjungList",List);	
		view.setViewName("kongjung/kongjung_info");
		
	return view;                      
	}
	@RequestMapping("/search.do")
	public ResponseEntity<String> selectSearch(String search){
		List<KongjungDTO> list = kongjungService.selectSearch(search);
		return new ResponseEntity(list,HttpStatus.OK);
	}
	
	@PostMapping("/deleteSelected.do")
	public ResponseEntity<Map<String, Object>> deleteSelected(@RequestBody List<Long> selectedIds) {
	    Map<String, Object> response = new HashMap<>();
	    HttpStatus status = HttpStatus.OK;

	    boolean success = kongjungService.deleteSelected(selectedIds);
	    if (success) {
	        response.put("message", "선택된 항목이 삭제되었습니다.");
	    } else {
	        response.put("message", "삭제 중 오류가 발생했습니다.");
	        status = HttpStatus.INTERNAL_SERVER_ERROR;
	    }

	    response.put("success", success);
	    return new ResponseEntity<>(response, status);
	}

	
	@RequestMapping("/kongjung_insert")
	public String KongjungTest1() {
		return "/kongjung/kongjung_insert";
	}
	@RequestMapping("/kongjung_update")
	public String KongjungTest2() {
		return "/kongjung/kongjung_update";
	}
	@RequestMapping("/recipe_info")     
	public ModelAndView allList1(KongjungDTO kongjungDTO , ModelAndView view)  {
		List<KongjungDTO> List = kongjungService.selectAllList1(kongjungDTO);    //  임시 KongjungService의 seletAllList List로 담음
		view.addObject("recipeList",List);	
		view.setViewName("kongjung/recipe_info");
		
	return view;                      
	}
	@RequestMapping("/search1.do")
	public ResponseEntity<String> selectSearch1(String search){
		List<KongjungDTO> list = kongjungService.selectSearch1(search);
		return new ResponseEntity(list,HttpStatus.OK);
	}
	@RequestMapping("/recipe1")
	public String RecipeTest1() {
		return "/kongjung/recipe_insert";
	}
	@RequestMapping("/recipe_update")
	public String RecipeTest2() {
		return "/kongjung/recipe_update";
	}

}