package com.tech.teacher.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tech.teacher.Student;

@Configuration
public class BeansConfiguration {
	@Bean(name="student")
	public Student getStudent()
	{
		return new Student();
		
	}
	@Bean(name="student2")
	public Student getStudentMohit()
	{
		return new Student();
		
	}
	
}
