package com.spring.jsp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller 
public class LoginController {
	
	//displaying logi page 
	
	@GetMapping("/login")
	public String loadLoginPage() {
		return "login";
	}
	
	@PostMapping("/loginCheck")
	
	//Model is used for jsp Representation
	public String validationOfUserDetails(Model model, HttpServletRequest request) {
		String name=request.getParameter("name");
		String pwd=request.getParameter("pwd");
		
		//jpa module 
		//find
		
		if("mohit".equalsIgnoreCase(name) && "Mohit@123".equalsIgnoreCase(pwd)) {
			model.addAttribute("validationMessage", "Welcome to Spring Application");
		}
		else {
			model.addAttribute("validationMessage" ,"Invalid Credentials");
		}
		return "success";
	}

}
