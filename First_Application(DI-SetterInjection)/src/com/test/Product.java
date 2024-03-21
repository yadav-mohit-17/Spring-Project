package com.test;

public class Product {
	private String pcode,pname;
	private float price;
	private int pqty;
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getPqty() {
		return pqty;
	}
	public void setPqty(int pqty) {
		this.pqty = pqty;
	}
	
	public String toString()
	{
		return"Product[pcode=+pcode, pname=+pname, price=+price, pqty=+pqty]";
	}
}
