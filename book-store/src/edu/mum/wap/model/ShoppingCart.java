package edu.mum.wap.model;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShoppingCart implements Serializable {

	private static final long serialVersionUID = 1L;

	private User user;
	List<Product> products;
	private int totalItems = 0;
	private Double totalPrice = 0.0;
	private Double shipping;

	public ShoppingCart() {
		// TODO Auto-generated constructor stub
		products = new ArrayList<>();
	}

	public List<Product> getProducts() {
		return products;
	}

	public void addProducts(Product product) {
		if (this.products.contains(product)) {
			for(Product p : this.products) {
				if (p.equals(product)) {
					p.setQuantity(p.getQuantity() + product.getQuantity());
					this.totalItems += product.getQuantity();
					break;
				}
			}
			
		} else {
			this.products.add(product);
			this.totalItems += product.getQuantity();
		}
	}
	
	public void delete(Product product) {
		if (this.products.contains(product)) {
			for(Product p : this.products) {
				if (p.equals(product)) {
					this.totalItems -= product.getQuantity();
					break;
				}
			}
			this.products.remove(product);
		}
	}

	public void calculatedTotalPrice() {
		this.totalPrice = products.stream().mapToDouble(y -> y.getItem().getUnitPrice() * y.getQuantity()).sum();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getTotalItems() {
		return totalItems;
	}

	public String getTotalPrice() {
		return format(totalPrice);
	}

	public String getShipping() {
		return format(shipping);
	}

	public String getTotal() {
		return format(totalPrice.doubleValue() + shipping.doubleValue());
	}

	public String format(Double value) {
		DecimalFormat formatter = new DecimalFormat("#0.00");
		return formatter.format(value);
	}

	public void calculateShipping() {
		Random r = new Random();
		this.shipping = 10 * r.nextDouble();
	}

	/*
	 * public static List<Item> setProducts() { Item item= new Item("book1",
	 * "Sciense Fiction", 10, 2, true); Item item2= new Item("book2", "Technology",
	 * 10, 2, true); Item item3= new Item("book3", "Stories", 10, 2, true); Item
	 * item4= new Item("book4", "Health", 10, 2, true);
	 * 
	 * List<Item>products=new ArrayList<>();
	 * 
	 * 
	 * products.add(item); products.add(item2); products.add(item3);
	 * products.add(item4);
	 * 
	 * return products; }
	 */

	public void checkout() {
	}

	@Override
	public String toString() {
		return "ShoppingCart [user=" + user + ", products=" + products + ", totalItems=" + totalItems + ", totalPrice="
				+ totalPrice + ", shipping=" + shipping + "]";
	}

}
