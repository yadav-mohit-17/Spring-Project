package com.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Request.UserRegisterRequest;
import com.spring.response.UserRegisterResponse;
import com.spring.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/register")
	public String registerUserDetails(@RequestBody UserRegisterRequest request) {
		// controller ---> service
		// from service receiving Result
		String response = userService.registerUserDetails(request);
		System.out.println("User Registered Successfull...");
		return response;
	}

	// fetch user Details of one person

	@GetMapping("/fetch")
	public UserRegisterResponse getUserDetails() {

		// Repository-->Service-->Controller
		UserRegisterResponse response = new UserRegisterResponse();
		response.setName("Mohit Kumar");
		response.setEmail("mohit.au001@gmail.com");
		response.setMobile("9128441424");
		response.setPassword("Mohit@123");
		
		System.out.println("Details of One Person");

		return response;

	}

	@GetMapping("/fetch/all")
	@ResponseBody
	public List<UserRegisterResponse> getAllUserDetails() {
		
		//repository-->service-->controller
		List<UserRegisterResponse> allUsers=new ArrayList<>();
		
		UserRegisterResponse user1=new UserRegisterResponse();
		user1.setName("Mohit Kumar");
		user1.setEmail("mohit.au001@gmail.com");
		user1.setMobile("9128441424");
		user1.setPassword("Mohit@123");
		
		allUsers.add(user1);
		
		UserRegisterResponse user2=new UserRegisterResponse();
		user2.setName("Deepak Kumar");
		user2.setEmail("deepak@gmail.com");
		user2.setMobile("9582230812");
		user2.setPassword("Deepak@123");
		
		allUsers.add(user2);
		
		UserRegisterResponse user3=new UserRegisterResponse();
		user3.setName("chandan Kumar");
		user3.setEmail("chandan@gmail.com");
		user3.setMobile("8786005721");
		user3.setPassword("Chandan@123");
		
		allUsers.add(user3);
		System.out.println("Details of multiple Persons");
		
		//Java Shoud be Converted to JSON
		return allUsers;
	}
}
