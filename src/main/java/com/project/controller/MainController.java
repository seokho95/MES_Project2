package com.project.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
	
	@RequestMapping("/header")
    public String header() {
        return "header/header";
    }
    @RequestMapping("/mainpage")
    public String mainpage() {
        return "mainpage/mainpage";
    }
    
}