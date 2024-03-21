package com.tech.teacher.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tech.teacher.Order;

@Configuration
public class BeanConfiguration {
	@Bean
	public Order getOrder()
	{
		Order or=new Order();
		or.setOrderId("order_Mouse");
		or.setOrderValue(1200.89);
		return or;
	}
	@Bean
	public Order getOrder_1()
	{
		Order or=new Order();
		or.setOrderId("order_Keyboard");
		or.setOrderValue(1300.99);
		return or;
	}
	@Bean
	public Order getOrder_3()
	{
		return new Order();
	}
	@Bean("order_4")
	public Order getOrder_4()
	{
		return new Order();
	}
}
