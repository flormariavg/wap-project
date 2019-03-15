package edu.mum.wap.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Product implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int quantity;
    private Item item;
    public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(Item item, int q) {
		this.item  = item;
		this.quantity = q;
	}
	public double getProductPrice(Item prod) {
		return prod.getUnitPrice();
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	@Override
	public String toString() {
		return "Product [quantity=" + quantity + ", item=" + item + "]";
	}
	
	
	
	public static List<Item> setItems() {
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
	
	public static void main(String[] args) {
		List<Item> products = Product.setItems();
		for (Item item : products) {
			System.out.println(item);
			
		}
		
	}
}
