package com.zomato.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zomato.dto.UserLogin;
import com.zomato.dto.UserRegister;
import com.zomato.service.ZomatoUserService;

@RestController 
public class ZomatoController {
	
	@Autowired
	ZomatoUserService service;
	
	@PostMapping("/create/user")
	public String registerUser(@RequestBody UserRegister request) {
		
		String result=service.registerUser(request);
		return result;
	}
	
	//This is for Login Operation :Integrate Security Layer +JWT token
	
	@PostMapping("/login/user")
	public String loginUser(@RequestBody UserLogin request) {
		
		// We need to pass the request to the spring security layer
		// internally, spring security layer validates user request
		// internally, security layer connects to DataBase, and check for username and password which its got from request
		// if user is valid and certified by security, generate token and attach as part of respose object
		// JWT token Generation : by passing login userName
		// in case user is invalid, then we will send message like invalid user credential
		
		String result=service.loginUser(request);
		return result;
		
	}

}
