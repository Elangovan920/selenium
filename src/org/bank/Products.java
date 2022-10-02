package org.bank;

public class Products {
	private int code;
	private String product;
	private int quantity;
public Products(int code,String product,int quantity) {
	this.code=code;
	this.product=product;
	this.quantity=quantity;
	}
public int getCode() {
	return code;
}
public String getProduct() {
	return product;
}
public int getQuantity() {
	return quantity;
}
public void setCode(int code) {
	this.code = code;
}
public void setProduct(String product) {
	this.product = product;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public void displayproduct() {
	System.out.println(getCode()+"-"+getProduct()+"-"+getQuantity());

}
    
}
