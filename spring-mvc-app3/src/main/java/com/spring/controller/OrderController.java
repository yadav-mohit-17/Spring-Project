package com.spring.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/order")
public class OrderController {
	
	@PostMapping("/add")
	public String createOrder() {
		return "Order Created Successfull...";
	}
	
	@PutMapping("/update")
	public String updateOrder() {
		return "Order Updated Successfully...";
	}
	
	@GetMapping("/view")
	public String loadOrder() {
		return "Order Details are Iphone  150000";
	}
	
	@DeleteMapping("/delete")
	public String deleteOrder() {
		return "Order Deleted Successfull..";
	}

}
