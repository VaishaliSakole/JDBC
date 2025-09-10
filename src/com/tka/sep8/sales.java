package com.tka.sep8;

public class sales {
private int pid;
private String product_name;
private String category;
private int qty;
private int price;
public sales(int pid, String product_name, String category, int qty, int price) {
	super();
	this.pid = pid;
	this.product_name = product_name;
	this.category = category;
	this.qty = qty;
	this.price = price;
}

public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getProduct_name() {
	return product_name;
}
public void setProduct_name(String product_name) {
	this.product_name = product_name;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "sales [pid=" + pid + ", product_name=" + product_name + ", category=" + category + ", qty=" + qty
			+ ", price=" + price + "]";
}
}
