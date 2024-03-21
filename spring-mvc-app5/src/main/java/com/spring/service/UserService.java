package com.spring.service;

import org.springframework.stereotype.Service;

import com.spring.Request.UserRegisterRequest;

@Service 
public class UserService {
	public String registerUserDetails(UserRegisterRequest registerRequest) {
		
		System.out.println("UserService:registerUserDetails()");
		System.out.println(registerRequest.getName());
		System.out.println(registerRequest.getEmail());
		System.out.println(registerRequest.getMobile());
		System.out.println(registerRequest.getPassword());
		
		return "User Registered Successfully";
	}

}
