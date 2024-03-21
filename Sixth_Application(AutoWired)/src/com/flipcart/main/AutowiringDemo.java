package com.flipcart.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.flipcart.order.Order;

public class AutowiringDemo {

	public static void main(String[] args) {
		ApplicationContext context=new FileSystemXmlApplicationContext("D:\\Java Program\\Eclipse IDE\\Spring\\Sixth_Application(AutoWired)\\bean.xml");
		Order order=(Order) context.getBean("order");
		System.out.println(order.getOrderId());
		System.out.println(order.getOrderValue());
	//	System.out.println(order.getProduct().hashCode());
	//	System.out.println(order.getProduct().getProductId());
	//	System.out.println(order.getProduct().getProductName());
	}

}
