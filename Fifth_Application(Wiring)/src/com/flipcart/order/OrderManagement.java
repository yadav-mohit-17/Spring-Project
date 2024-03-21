package com.flipcart.order;

public class OrderManagement {
private int noOfOrders;
private double totalAmount;
private Order order;
public OrderManagement() {
	super();
	// TODO Auto-generated constructor stub
}
public OrderManagement(int noOfOrders, double totalAmount, Order order) {
	super();
	this.noOfOrders = noOfOrders;
	this.totalAmount = totalAmount;
	this.order = order;
}
public int getNoOfOrders() {
	return noOfOrders;
}
public void setNoOfOrders(int noOfOrders) {
	this.noOfOrders = noOfOrders;
}
public double getTotalAmount() {
	return totalAmount;
}
public void setTotalAmount(double totalAmount) {
	this.totalAmount = totalAmount;
}
public Order getOrder() {
	return order;
}
public void setOrder(Order order) {
	this.order = order;
}


}
