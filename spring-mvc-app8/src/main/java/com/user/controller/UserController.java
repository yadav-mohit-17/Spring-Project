package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.user.request.UserRequest;
import com.user.response.UserResponse;
import com.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService service;
	
	@PostMapping("/register")
	public String registerUserDetails(@RequestBody UserRequest request) {
		String register=service.registerUserData(request);
		return register;
	}
	
	@RequestMapping(value="/get/{email}",method=RequestMethod.GET)
	public UserResponse getUserByEmailId(@PathVariable("email") String email) {
		return service.getUserDetail(email);
		
	}

}
