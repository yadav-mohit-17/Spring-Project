package com.flipcart.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.flipcart.order.OrderManagement;
import com.flipcart.order.*;
import com.flipcart.product.*;
import com.flipcart.payment.*;

public class FlipcartApplication {

	public static void main(String[] args) {
		ApplicationContext context=new FileSystemXmlApplicationContext("D:\\Java Program\\Eclipse IDE\\Spring\\Sixth_Application(AutoWired)\\bean.xml");
		OrderManagement ordermanage=(OrderManagement) context.getBean("ordermanagement");
		System.out.println(ordermanage.getNoOfOrders());
		System.out.println(ordermanage.getTotalAmount());
		System.out.println(ordermanage.getOrder().hashCode());
		System.out.println(ordermanage.getOrder().getOrderId());
		System.out.println(ordermanage.getOrder().getOrderValue());
	}

}
