package com.tech.teacher;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tech.teacher.config.BeansConfiguration;
import com.tech.teacher.config.SpringBeanConfiguration;

public class BeansTesting {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(BeansConfiguration.class,SpringBeanConfiguration.class);
//		context.refresh();
		
		Student student=(Student) context.getBean("student");
		System.out.println(student.getStudentId()+"\t"+student.getStudentName());
		
		Product product=(Product) context.getBean("mouse");
		System.out.println(product.getProductId()+"\t"+product.getProductName()+"\t"+product.getPrice());

		Product product1=(Product) context.getBean("keyboard");
		System.out.println(product1.getProductId()+"\t"+product1.getProductName()+"\t"+product1.getPrice());
	}

}
