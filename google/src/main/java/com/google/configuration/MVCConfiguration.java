package com.google.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration 
@ComponentScan("com.google.*")
@EnableWebMvc 
public class MVCConfiguration extends WebMvcConfigurationSupport{

}
