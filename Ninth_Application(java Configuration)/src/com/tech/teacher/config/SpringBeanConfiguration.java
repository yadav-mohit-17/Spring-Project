package com.tech.teacher.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tech.teacher.Product;

@Configuration
public class SpringBeanConfiguration {
	@SuppressWarnings("unused")
	@Bean(name="mouse")
	public Product getProduct()
	{
		Product product=new Product();
		List<String> Product= new ArrayList<>();
		product.setProductId(12366);
		product.setProductName("Mouse");
		product.setPrice(1200);
		return product;
		
	}
	public void printData()
	{
		System.out.println("This is all abot Extra method...");
	}
	@Bean("keyboard")
	public Product getProduct2()
	{
		Product product=new Product();
		product.setProductId(86811);
		product.setProductName("KeyBoard");
		product.setPrice(1400);
		return product;
	}
}
