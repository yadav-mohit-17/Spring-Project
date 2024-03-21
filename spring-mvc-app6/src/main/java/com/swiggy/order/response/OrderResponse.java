package com.swiggy.order.response;

public class OrderResponse {
	private String orderId;
	private String orderStatus;
	private double amount;
	private String emailId;
	private String City;
	public OrderResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderResponse(String orderId, String orderStatus, double amount, String emailId, String city) {
		super();
		this.orderId = orderId;
		this.orderStatus = orderStatus;
		this.amount = amount;
		this.emailId = emailId;
		this.City = city;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	
}
