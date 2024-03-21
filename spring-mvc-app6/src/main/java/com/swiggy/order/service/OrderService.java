package com.swiggy.order.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swiggy.order.entity.SwiggyOrder;
import com.swiggy.order.repository.OrderRepository;
import com.swiggy.order.request.OrderRequest;
import com.swiggy.order.response.OrderResponse;

@Service
public class OrderService {
	
	@Autowired 
	OrderRepository orderRepository;
	
	public String createOrder(OrderRequest request) {
		SwiggyOrder order=new SwiggyOrder();
		order.setOrderId(request.getOrderId());
		order.setCity(request.getCity());
		order.setEmailId(request.getEmailId());
		order.setAmount(request.getAmount());
		order.setOrderStatus(request.getOrderStatus());
		
		orderRepository.save(order);
		
		return "Order Created Successfully";
	}
	
	public List<OrderResponse> getOrdersByEmailIdAndStatus(String emailId,String orderStatus){
		
		List<SwiggyOrder> orders=orderRepository.findByEmailIdAndOrderStatus(emailId, orderStatus);
		List<OrderResponse> allOrders=orders.stream().map(v -> new OrderResponse(
													v.getOrderId(),v.getOrderStatus(),v.getAmount(),v.getEmailId(),v.getCity()
												)).collect(Collectors.toList());
			return allOrders;
	}
}
