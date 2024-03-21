package com.flipcart.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.flipcart.order.Order;
import com.flipcart.order.OrderManagement;
import com.flipcart.product.Product;

public class FlipcartApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context=new FileSystemXmlApplicationContext("D:\\Java Program\\Eclipse IDE\\Spring\\Fourth_Application(Wiring)\\bean.xml");
		
		Product product=(Product) context.getBean("product");
		System.out.println("********Using Constructor-Injection*********");
		System.out.println(product.getProductId()+"\t"+product.getProductName());
		
		Order order=(Order) context.getBean("order");
		System.out.println("\n********Using Setter Injection*********");
		System.out.println(order.getOrderId()+"\t"+order.getProduct().getProductId()+"\t"+order.getProduct().getProductName()+"\t"+order.getOrderValue());
	
		OrderManagement ordmgnt=(OrderManagement) context.getBean("ordermanagement");
		System.out.println("\n********Using Setter-Injection********");
		System.out.println(ordmgnt.getNoOfOrders());
		System.out.println(ordmgnt.getTotalAmount());
		System.out.println(ordmgnt.getOrder().getOrderId());
		System.out.println(ordmgnt.getOrder().getOrderValue());
		System.out.println(ordmgnt.getOrder().getProduct().getProductId());
		System.out.println(ordmgnt.getOrder().getProduct().getProductName());
	}

}
