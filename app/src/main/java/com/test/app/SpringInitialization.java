package com.test.app;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringInitialization extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {MVCConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		String[] allowedURLMapping= {"/"};
		return allowedURLMapping;
	}

}
