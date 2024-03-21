package com.swiggy.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.swiggy.user.request.UserRegisterRequest;
import com.swiggy.user.response.UserRegisterResponse;
import com.swiggy.user.response.UserResponse;
import com.swiggy.user.service.UserService;

@RestController 
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	
	@PostMapping("/register")
	public String RegisterUserDetails(@RequestBody UserRegisterRequest request) {
		// Controller--->Service and from Service Receiving Result
		String response=userService.registerUserDetails(request);
		return response;
	}
	
	//fetch User Details of one person by emailID
	
	@GetMapping("/fetch")
	public UserRegisterResponse getUserDetails() {
		String email="mohit.au001@gmail.com";
		UserRegisterResponse response=userService.GetUserDetails(email);
		return response;
	}
	
	//path Variables
	
	@RequestMapping(value="/get/{emailId}",method=RequestMethod.GET)
	public UserRegisterResponse getUserByEmailId(@PathVariable("emailId") String email) {
		return userService.GetUserDetails(email);
		
	}
	
	@PostMapping("/register/record")
	public String addUserRecords(@RequestBody UserResponse userResponse) {
		String response1=userService.registerUserResponse(userResponse);
		return response1;
	}
	
	//list of users from city hyderabad
	//localhost:8087/swiggy/uset/get?city=hyderabad
	
//	@GetMapping("/get")
//	public String getUserByCity(@RequestParam("city") String city) {
//		String city="hyderabad";
//		UserResponse userResponse=userService.GetUserDetails(city);
//		
//	
//		return "User From City :"+city+" : are 1000";
//	}
	
	
	@GetMapping("/get/city/gender")
	public String getUsersByCityAndGender(@RequestParam(name="city") String city, @RequestParam(name = "gender", required = false) String gender) {	
		String response=null;
		if(city !=null) {
			response="From City 1000"+city;
		}
		else if(gender !=null) {
			response="From Gender :333820"+gender;
		}
		else {
			response="Over All India is :200084372";
		}
		
		return response;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
