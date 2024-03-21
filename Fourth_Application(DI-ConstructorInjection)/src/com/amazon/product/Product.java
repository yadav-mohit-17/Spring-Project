package com.amazon.product;

import java.util.Map;
import java.util.Set;

public class Product {
	private int productId;
	String productName;
	double productPrice;
	boolean isExpired;
	Set<String> products;
	Map<String,String> productsPrice;
	public Product(int productId,String productName, double productPrice, boolean isExpired, Set<String> products,
			Map<String, String> productsPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.isExpired = isExpired;
		this.products = products;
		this.productsPrice = productsPrice;
	}

	public Product() {
		super();
	}
	
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public boolean isExpired() {
		return isExpired;
	}
	public void setExpired(boolean isExpired) {
		this.isExpired = isExpired;
	}
	public Set<String> getProducts() {
		return products;
	}
	public void setProducts(Set<String> products) {
		this.products = products;
	}
	public Map<String, String> getProductsPrice() {
		return productsPrice;
	}
	public void setProductsPrice(Map<String, String> productsPrice) {
		this.productsPrice = productsPrice;
	}
	
	
}
