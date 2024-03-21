package com.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/user")
public class UserController {
//	@GetMapping("/register")
	public String getUserDetails(@RequestBody UserRegisterRequest request) {
		
		System.out.println(request.getName());
		System.out.println(request.getEmail());
		System.out.println(request.getMobile());
		System.out.println(request.getPassword());
		
		return "User Created Successfully";
	}

}
