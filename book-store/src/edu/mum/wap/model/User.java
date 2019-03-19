package edu.mum.wap.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String username;
	private String password;
	private Person person;
	
	private List<Order> orders;
	private String paymentMethod;
	private Address billingAddress;
	private ShoppingCart shoppingCart;
	
	public User() {
		
	}
	
	public User(String username, String password) {
		// TODO Auto-generated constructor stub
		this.username= username;
		this.password= password;
		
		orders= new ArrayList<>();
		
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void addOrders(Order order) {
		this.orders.add(order);
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public Address getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}
	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

}
