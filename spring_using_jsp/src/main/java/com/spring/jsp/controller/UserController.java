package com.spring.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@RequestMapping("/user")
public class UserController {
	
	//Invokig View Layer, Jsp file
	
	@GetMapping("message")
	public String sayHello(Model model) {
		model.addAttribute("message","This is Spring Applicatiob"+Math.random());
		model.addAttribute("contact","mohit.au001@gmail.com");
		
		//invoking hello.jsp
		//it return hello.jsp file
		return "hello";
	}
	@GetMapping("/contact")
	@ResponseBody
	public String contactEmail() {
		return "mohit.au001@gmail.com";
	}
	
}
