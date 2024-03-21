package com.spring.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller 
public class LoginController {
	@GetMapping("/login")
	public String loadLoginPage() {
		return "login";
	}
	
	@PostMapping("/checklogin")
	public String validationOfUserDetails(Model model ,HttpServletRequest request ) {
		String Name=request.getParameter("name");
		String Password=request.getParameter("pword");
		
		if("Mohit".equalsIgnoreCase(Name) && ("Mohit@123".equalsIgnoreCase(Password)))
		{
			model.addAttribute("validationmessage", "Welcome to Spring Trainning");
		}
		else
		{
			model.addAttribute("validationmessage","Invalid Login Process...");
		}
		return "success";
	}

}
