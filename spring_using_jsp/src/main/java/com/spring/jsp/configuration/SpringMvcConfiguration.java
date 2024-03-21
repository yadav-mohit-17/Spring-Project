package com.spring.jsp.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.spring.*")
@EnableWebMvc
public class SpringMvcConfiguration extends WebMvcConfigurationSupport{

	/*InternalResourceViewResolver is used to resolve the provided URI to actual URI.
	  The InternalResourceViewResolver allows mapping webpages with requests.
	*/
	public InternalResourceViewResolver getViewResolver() {
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		
		//provide the details of in which path folder
		viewResolver.setPrefix("/WEB-INF/views/");
		
		//Provide the extension
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
}
