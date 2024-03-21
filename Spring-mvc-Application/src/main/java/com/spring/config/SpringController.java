package com.spring.config;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
	@RequestMapping("/hello")
	public String sayHelloToAll()
	{
		return "Welcome to Spring MVC World";
	}
	
	
	@RequestMapping("/welcome")
	public String sayWelcomeMessage() {
		
		return "Welcome to Spring MVC World";
	}

}
