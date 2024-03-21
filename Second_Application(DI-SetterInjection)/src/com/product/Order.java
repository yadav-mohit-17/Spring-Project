package com.product;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Mohit Yadav
 *
 */
public class Order {
	private String orderId;
	private int price;
	private List<String> items;
	//private boolean isItemDelivered;
	private Set<String> item1;
	private Map<String,String> item2;
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public List<String> getItems() {
		return items;
	}
	public void setItems(List<String> items) {
		this.items = items;
	}
	
	public Set<String> getItem1() {
		return item1;
	}
	public void setItem1(Set<String> item1) {
		this.item1 = item1;
	}
	public Map<String, String> getItem2() {
		return item2;
	}
	public void setItem2(Map<String, String> item2) {
		this.item2 = item2;
	}
	
}
