package edu.mum.wap.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Item implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2477582562598788698L;
	private String code;
	private String image;
	private String name;
	private String description;
	private double unitPrice;
	private int quantity;
	private boolean inStock;
	private Person author;
	private Category category;
	private LocalDate release;
	private int quantitySold;

	public Item() {
		this.code = name+"+"+hashCode();
	}

	public Item(String image, String name, String description, double unitPrice, int quantity,
			boolean inStock, Person author, Category category, LocalDate release, int quantitySold) {
		super();
		this.image = image;
		this.name = name;
		this.description = description;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		this.inStock = inStock;
		this.author = author;
		this.category = category;
		this.release = release;
		this.quantitySold = quantitySold;
		setCode(name);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = name+"+"+hashCode();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isInStock() {
		return inStock;
	}

	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Person getAuthor() {
		return author;
	}

	public void setAuthor(Person author) {
		this.author = author;
	}

	public int getQuantitySold() {
		return quantitySold;
	}

	public void setQuantitySold(int quantitySold) {
		this.quantitySold = quantitySold;
	}

	public Category getCategory() {
		return category;
	}

	public LocalDate getRelease() {
		return release;
	}

	public void setRelease(LocalDate release) {
		this.release = release;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj==null)
			return false;
		Item product = (Item)obj;
		return product.name.equals(this.name);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(name);
	}

	@Override
	public String toString() {
		return "Item [code=" + code + ", image=" + image + ", name=" + name + ", description=" + description
				+ ", unitPrice=" + unitPrice + ", quantity=" + quantity + ", inStock=" + inStock + "]";
	}

}
