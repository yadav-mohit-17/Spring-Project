package com.product;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Product {
	private String productId,ProductName;
	private int price;
	boolean isExpired;
	List<String> products;
	Set<String> products1;
	Map<String,String> products2;
	
	public Product(String productId,String productName,int price,boolean isExpired,List<String> products,Set<String> products1,Map<String,String> products2)
	{
		super();
		this.productId = productId;
		ProductName = productName;
		this.price = price;
		this.isExpired = isExpired;
		this.products = products;
		this.products1=products1;
		this.products2=products2;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isExpired() {
		return isExpired;
	}

	public void setExpired(boolean isExpired) {
		this.isExpired = isExpired;
	}

	public List<String> getProducts() {
		return products;
	}

	public void setProducts(List<String> products) {
		this.products = products;
	}
	public Set<String> getProducts1() {
		return products1;
	}

	public void setProducts1(Set<String> products1) {
		this.products1 = products1;
	}
	public Map<String,String> getProducts2() {
		return products2;
	}

	public void setProducts2(Map<String,String> products2) {
		this.products2 = products2;
	}
	
	
	
}
