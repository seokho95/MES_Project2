package com.project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.dto.LoginDTO;
import com.project.service.LoginService;

@Controller
public class LoginController {
	 private LoginService loginService;

	  public LoginController(LoginService loginService) {
	        this.loginService = loginService;
	    }
	  @RequestMapping("/")
		public String main() {
		  


			return "mainpage/login";
		}
	@RequestMapping("/login")
	public String login(String userId, String passwd, HttpSession session, HttpServletResponse response) throws IOException {
	    LoginDTO dto = loginService.login( userId , passwd);
	    if (dto != null) {
	        session.setAttribute("user", dto);
	        System.out.println( session.getMaxInactiveInterval());
            return "redirect:/mainpage"; // 메인 페이지로 이동
	    }
	    else if(dto == null){
	    	response.setContentType("text/html; charset=UTF-8");
	    	PrintWriter out = response.getWriter();

	    	out.println("<script language='javascript'>");
	    	out.println("alert('아이디 또는 비밀번호가 틀렸습니다.')");
	    	out.println("</script>");

	    	out.flush();
	    	return "mainpage/login";
	    }else{
	    	
	    	return "mainpage/login";

	    }
	}
	@RequestMapping("/logout") 
	  public String logout(HttpSession session) {
	  session.invalidate(); // 세션을 무효화하여 로그아웃 처리 
	  return "redirect:/"; // 로그아웃 후 메인페이지로 리다이렉트 
	  }

}
