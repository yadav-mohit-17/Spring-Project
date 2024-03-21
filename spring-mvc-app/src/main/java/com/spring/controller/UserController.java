package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	
	@RequestMapping(method=RequestMethod.GET , path="/register")
	@ResponseBody
	public String userRegister() {
		return "User Registered Successfully...";
	}
	
	@RequestMapping(method=RequestMethod.POST , path="/login")
	@ResponseBody
	public String userLogin() {
		return "User Login Successful...";
	}
	
	@RequestMapping("/operation")
	@ResponseBody
	public String userOperation() {
		return "User Perform Operation Successfully...";
	}
}
