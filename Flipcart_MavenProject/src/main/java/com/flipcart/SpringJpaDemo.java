package com.flipcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringJpaDemo {
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("flipcart.*");
		context.refresh();
		
		//create Entity Object
		FlipakartOrder order=new FlipakartOrder();
		order.setOrderID(9988);
		order.setProductName("Book");
		order.setTotalAmount(333);
		
		//pass Entity Object to Repository Method
		OrderDbOperation dbOperation=context.getBean(OrderDbOperation.class);
		dbOperation.addOrderDetails1(order);
	}

}
