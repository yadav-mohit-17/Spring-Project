package com.app.spring.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class[] {MVCConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		String [] allowedUrlMapping= {"/"};
		return allowedUrlMapping;
	}

}
