package com.spring.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping ("/order")
public class OrderController {
	@RequestMapping(name="creatingOrderMapping", value="/add", method=RequestMethod.POST)
	@ResponseBody	
	public String createOrder() {
		return "Order Created Successfull";
	}
	
	@RequestMapping(name="This is put Updating", path="/update",method=RequestMethod.PUT)
	@ResponseBody
	public String updateOrderDetails() {
		return "Order Updated Successfully";
	}
	
	@GetMapping("/load")
	@ResponseBody
	public String getOrderDetails() {
		return "Order Details are  : "+1500+" "+"iphone";
	}
	
	@GetMapping("/get/all")
	@ResponseBody
	public String getAllOrderDetailOfUser() {
		return "Thanks Mohit. Here is your Order History  : "+"Iphone" +"Watch";
	}
	
	public String deleteOrder() {
		//jpa + Run Delete Query
		return "Order Deleted";
	}
}
