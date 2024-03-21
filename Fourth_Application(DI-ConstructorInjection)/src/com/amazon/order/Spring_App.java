package com.amazon.order;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.amazon.product.Product;

public class Spring_App {

	public static void main(String[] args) {
		BeanFactory factory=new FileSystemXmlApplicationContext("D:\\Java Program\\Eclipse IDE\\Spring\\Fourth_App\\bean.xml");
		Order order=(Order) factory.getBean("order");
		System.out.println("========order-details========");
		System.out.println(order.getOrderId()+"\t"+order.getOrderValue());
		System.out.println(order.getProduct());
		System.out.println(order.getProduct().getProductId());
		System.out.println(order.getProduct().getProductName());
		System.out.println(order.getProduct().getProductPrice());
		System.out.println(order.getProduct().getProducts());
		System.out.println(order.getProduct().getProductsPrice());
	}

}
