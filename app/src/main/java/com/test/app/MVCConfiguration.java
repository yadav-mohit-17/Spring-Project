package com.test.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
@ComponentScan("com.test.app.*")
public class MVCConfiguration extends WebMvcConfigurationSupport{
	
}