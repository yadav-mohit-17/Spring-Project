package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	@RequestMapping(name="Creating Under Mapping",value="/add", method=RequestMethod.POST)
	@ResponseBody
	public String createOrder() {
		return "Order Created..";
	}
	
	@RequestMapping(name="This is Put Method", path="/update", method=RequestMethod.PUT)
	@ResponseBody
	public String updateOrder() {
		return "Order Updated Successfully...";
	}
	
	@RequestMapping(name="this is Delete Method", path="/delete", method=RequestMethod.DELETE)
	@ResponseBody
	public String deleteOrder() {
		return "Order Deleted Successfully....";
	}
	
	@RequestMapping(value="/load", method=RequestMethod.GET)
	@ResponseBody
	public String loadOrder() {
		return "Order Loaded Successfully...";
	}

}
