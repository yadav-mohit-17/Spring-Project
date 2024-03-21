package com.flipcart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderDbOperation {
	
	@Autowired
	FlipakartOrderRepository flipkartOrderRepository;
	
	public void addOrderDetails1(FlipakartOrder order)
	{
		flipkartOrderRepository.save(order);
	}
}
