package com.tech.teacher;


public class Order {
	private String orderId;
	private double orderValue;
	public Order() {
		super();
		System.out.println("Order Object Created....");
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public double getOrderValue() {
		return orderValue;
	}
	public void setOrderValue(double orderValue) {
		this.orderValue = orderValue;
	}
	
	
	
}
