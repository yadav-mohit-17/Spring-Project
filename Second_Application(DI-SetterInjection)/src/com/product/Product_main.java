package com.product;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Product_main {

	public static void main(String[] args) {
		// IOC container Object
		BeanFactory factory=new FileSystemXmlApplicationContext("D:\\Java Program\\Eclipse IDE\\Spring\\Second_App(product)\\product-bean.xml");
		Product prod=(Product) factory.getBean("product");
		System.out.println(prod.getProductId()+"\t"+prod.getProductName()+"\t"+prod.getPrice());
		
		Order ord=(Order) factory.getBean("order");
		System.out.println(ord.getOrderId());
		System.out.println(ord.getPrice());
	//	System.out.println(ord.isItemDelivered());
		System.out.println(ord.getItem1());
		System.out.println(ord.getItem2());
	}

}
