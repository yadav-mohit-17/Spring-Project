package com.amazon.order;

import com.amazon.product.Product;

public class Order {
	String orderId;
	double orderValue;
	Product product;
	
	
	public Order(String orderId, double orderValue, Product product) {
		super();
		this.orderId = orderId;
		this.orderValue = orderValue;
		this.product = product;
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
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
