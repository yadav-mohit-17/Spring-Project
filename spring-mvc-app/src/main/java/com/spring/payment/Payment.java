package com.spring.payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Payment {
	
	@GetMapping("/pay")
	public String payment() {
		return "Order Payment Successfully...";
	}
}
