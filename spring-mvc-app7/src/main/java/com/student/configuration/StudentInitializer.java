package com.student.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class StudentInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {StudentConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		String [] allowedUrlMapping= {"/","/student/*"};
		return allowedUrlMapping;
	}

}
