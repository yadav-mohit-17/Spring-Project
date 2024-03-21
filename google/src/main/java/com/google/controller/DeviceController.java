package com.google.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.dto.UserAccountData;

@RestController 
public class DeviceController {
	
	@PostMapping("/drive/account")
	public String addUserData(@RequestBody UserAccountData data) {
		
		//data transffering to service layer
		//from service to repository
		
		System.out.println(data);
		
		return "Drive Access Provided Successfully for :"+data.getGmailId();
		
	}
	
	@GetMapping("/drive/account/details")
	public UserAccountData getUserData() {
		
		//data transffering to service layer
		//from service to repository
		
		UserAccountData data=new UserAccountData();
		data.setDefaultMemoryInGB(20);
		data.setFullName("Mohit Kumar");
		data.setGmailId("mohit.au001@gmail.com");
		
		return data;
	}

}
