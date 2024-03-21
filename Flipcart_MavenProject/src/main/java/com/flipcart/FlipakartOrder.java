package com.flipcart;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flipcart_orders")
public class FlipakartOrder {
	
	@Id
	@Column(name="order_Id")
	private long orderID;
	
	@Column(name="productname")
	private String ProductName;
	
	@Column(name="totalamount")
	private float totalAmount;

	public long getOrderID() {
		return orderID;
	}

	public void setOrderID(long orderID) {
		this.orderID = orderID;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	
	
}
