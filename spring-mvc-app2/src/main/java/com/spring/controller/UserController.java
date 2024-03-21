package com.spring.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	@PostMapping("/register")
	public String register() {
		return "User Registration Successfull....";
	}
	
	@PostMapping("/login")
	public String login() {
		return "User Login Successfull...";
	}
	
	@PutMapping("/update")
	public String update() {
		return "User Profile Updated Successfull....";
	}
	
	@GetMapping("/view")
	public String view() {
		return "User Profile Loaded....";
	}
	
	@DeleteMapping("/delete")
	public String delete() {
		return "User Profile Deleted Successfully...";
	}

}
