package com.student.details;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Student_main {

	public static void main(String[] args) {
		//creating IOC container object
		BeanFactory factory=new FileSystemXmlApplicationContext("D:\\Java Program\\Eclipse IDE\\Spring\\Second_App(product)\\student-bean.xml");
		Address addr=(Address) factory.getBean("address");
		System.out.println(addr.getCity()+"\t"+addr.getState()+"\t"+addr.getCountry()+"\t"+addr.getPincode());
		
		Student std=(Student) factory.getBean("student");
		System.out.println(std.getStudentId()+"\t"+std.getStudentName()+"\t"+std.getMobile()+"\t"+std.getAddr().getCity()+"\t"+std.getAddr().getState()+"\t"+std.getAddr().getCountry()+"\t"+std.getAddr().getPincode());
	}

}
