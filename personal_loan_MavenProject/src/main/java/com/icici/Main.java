package com.icici;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.*");
		context.refresh();
		
		Account acc=context.getBean(Account.class);
		System.out.println(acc.hashCode());
		//System.out.println("Mohit kumar");
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
		System.out.println("Connection Successfully..");

	}

}
