package com.product;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Product_main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		BeanFactory factory=new FileSystemXmlApplicationContext("D:\\Java Program\\Eclipse IDE\\Spring\\Third_App(DI-ConstructorInjection)\\product-bean.xml");
		
		Product prod=(Product) factory.getBean("product");
		System.out.println("*********Constructor-Injection*********");
		System.out.println(prod.getProductId()+"\t"+prod.getProductName()+"\t"+prod.getPrice()+"\t"+prod.isExpired);
		System.out.println("=======List=======");
		System.out.println(prod.getProducts());
		System.out.println("=======Set========");
		System.out.println(prod.getProducts1());
		System.out.println("=======MAP<Key,Value=======>");
		System.out.println(prod.getProducts2());
	}

}
