package com.spring.controller;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
	//invoking view layer, jsp file
	@GetMapping("/message")
	public String sayHello(Model model) {
		model.addAttribute("message", "This is 8pm batch" +Math.random());
		model.addAttribute("contact", "mohit.au001@gmail.com");
		//invoking hello.jsp file
		return "hello"; //corresponding jsp file name hello.jsp
	}
	
	@GetMapping("/contact")
	@ResponseBody
	public String ContactEmail() {
		return "mohit.au001@gmail.com";
	}
}
