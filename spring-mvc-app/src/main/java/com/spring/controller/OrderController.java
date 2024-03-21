package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class OrderController {
	
	@RequestMapping("/create")
	@ResponseBody
	public String orderCreated() {
		return "Order Created Successfully...";
	}
	
	@GetMapping("/view")
	@ResponseBody
	public String orderView() {
		return "Your Added Order...";
	}
	
	@PutMapping("/update")
	@ResponseBody
	public String orderUpdate() {
		return "Order Updated Successfully...";
	}
	
	@DeleteMapping("/delete")
	@ResponseBody
	public String orderDelete() {
		return "Order Deleted Successfully...";
	}
	
}
