package edu.mum.wap.model;

import java.io.Serializable;

public class Order implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9019152399194909088L;

	private Address shippingAddress;
	
	private String paymentMethod;
	
	private Address billingAddress;
	
	private ShoppingCart shoppingCart;

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
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
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		return "Order [shippingAddress=" + shippingAddress + ", paymentMethod=" + paymentMethod + ", billingAddress="
				+ billingAddress + ", shoppingCart=" + shoppingCart + "]";
	}

}
