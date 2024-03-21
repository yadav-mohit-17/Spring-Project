package com.tech.teacher.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tech.teacher.Product;
public class StringComponent {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.tech.teacher","com.security");
		context.refresh();
		
		context.register(BeanConfiguration.class);
		context.getBean("order_4");
		
		Product product=context.getBean(Product.class);
		System.out.println(product);
		
		Product product1=context.getBean(Product.class);
		System.out.println(product1);
		
	}

}
