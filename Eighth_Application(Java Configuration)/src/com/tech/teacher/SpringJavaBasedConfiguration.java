package com.tech.teacher;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.tech.teacher.configuration.*;



public class SpringJavaBasedConfiguration {
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		//creating IOC Container
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(BeansConfiguration.class);
	
		Student student=(Student) context.getBean("student");
		System.out.println(student.hashCode());
		System.out.println(student.getStudentId());
		System.out.println(student.getStudentName());
		
		
		Student student2=(Student) context.getBean("student2");
		System.out.println(student2.hashCode());
		System.out.println(student2.getStudentId());
		System.out.println(student2.getStudentName());
	}

}
