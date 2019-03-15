package edu.mum.wap.model;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShoppingCart implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String user;

	List<Product> products;
	
	public ShoppingCart() {
		// TODO Auto-generated constructor stub
		products= new  ArrayList<>();
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void addProducts(Product product) {
		this.products.add(product);
	}
	
	public Double calculatedTotalPrice() {
		return products.stream().mapToDouble(y-> y.getItem().getUnitPrice() * y.getQuantity()).sum();

	}
	public double calculateShipping() {
		Random r = new Random();
		DecimalFormat formatter = new DecimalFormat("#0,00");
		double shipping=1000 * r.nextDouble();
		return  Double.parseDouble(formatter.format(shipping));
	}
	
	public static List<Item> setProducts() {
		Item item= new Item("book1", "Sciense Fiction", 10, 2, true);
		Item item2= new Item("book2", "Technology", 10, 2, true);
		Item item3= new Item("book3", "Stories", 10, 2, true);
		Item item4= new Item("book4", "Health", 10, 2, true);
		
		List<Item>products=new ArrayList<>();
		
		
		products.add(item);
		products.add(item2);
		products.add(item3);
		products.add(item4);
		
		return products;
	}

	public void checkout(){
	}

	@Override
	public String toString() {
		return "ShoppingCart [user=" + user + ", products=" + products + "]";
	}

	
}
