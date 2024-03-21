package com.flipkart.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class UserController {

	@GetMapping("/data")
	public String getApplicationInformation(@RequestHeader(name="security-token",required=false,defaultValue="abcdxyz") String tokenValue,@RequestHeader("User-Agent") String UserAgent) {
		
		//send information to service
		
		return "This is Flipkart application :"+tokenValue+" : From Client "+UserAgent;
	}
	
	@GetMapping("/information")
	public ResponseEntity<String> getApplication(){
		
		//send information to service
		
		HttpHeaders headers =new HttpHeaders();
		headers.add("token", String.valueOf(Math.random()));
		headers.add("SecurityType", "JWT");
		
		return new ResponseEntity<String>("This is Flipkart and Running on Mohit System",headers,HttpStatus.OK);
	}
}
