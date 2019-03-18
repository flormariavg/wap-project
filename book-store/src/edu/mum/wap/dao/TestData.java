package edu.mum.wap.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import edu.mum.wap.model.Address;
import edu.mum.wap.model.Category;
import edu.mum.wap.model.Item;
import edu.mum.wap.model.Person;
import edu.mum.wap.model.Product;
import edu.mum.wap.model.ShoppingCart;

public class TestData {

	public static void main(String[] args) {
		DataAccess da = new DataAccessFacade();
		
		Address address= new Address("2000 North Court Street", "Fairfield", "IOWA", "EEUU", "1652845", "52576");

		Person person1 = new Person("Anonymous", " ", address, "p1@edu.com");
		Person person2 = new Person("Greyson", "Christopher", address, "p2@edu.com");
		Person person3 = new Person("Wingate","Lisa", address, "p3@edu.com");
		Person person4 = new Person("Randis", "K.L.", address, "p4@edu.com");
		Person person5 = new Person("Badani", "Sejal", address, "p5@edu.com");  
		Person person6 = new Person("Doerr", "Anthony", address, "p6@edu.com");  
		Person person7 = new Person("Eskens", "Allen", address, "p7@edu.com");  
		Person person8 = new Person("Albom", "Mitch", address, "p8@edu.com");  
		Person person9 = new Person("Hall Kelly", "Martha", address, "p9@edu.com");  
		Person person10 = new Person("Bowen", "Rhys", address, "p10@edu.com");  
		
		//Books inventory
		Item item1= new Item("images/b1.jpg", "My secret life", "My secret life", 15.0, 100, true, person1, Category.children, LocalDate.of(2012,10, 30), 1);
		Item item2= new Item("images/b2.jpg", "The Girl Who Lived", "The Girl Who Lived", 12.0, 100, true, person2, Category.children, LocalDate.of(2018,10, 30), 5);
		Item item3= new Item("images/b3.jpg", "Before We Were Yours", "Before We Were Yours", 10.0, 100, true, person3, Category.children, LocalDate.of(2013,10, 30), 10);
		Item item4= new Item("images/b4.jpg", "Spilled Milke", "Spilled Milk", 115.0, 100, true, person4, Category.children, LocalDate.of(2018,10, 30), 4);
		Item item5= new Item("images/b5.jpg", "The Storyteller's Secret", "The Storyteller's Secret", 45.0, 100, true, person5, Category.children, LocalDate.of(2017,10, 3), 3);
		Item item6= new Item("images/b6.jpg", "All the Light We Cannot See", "All the Light We Cannot Seee", 65.0, 100, true, person6, Category.children, LocalDate.of(2018,10, 30), 2);
		Item item7= new Item("images/b7.jpg", "The Life We Bury", "The Life We Bury", 25.0, 100, true, person7, Category.children, LocalDate.of(2011,10, 30), 1);
		Item item8= new Item("images/b8.jpg", "The Next Person You Meet in Heaven", "The Next Person You Meet in Heaven", 25.0, 100, true, person8, Category.children, LocalDate.of(2018,10, 30), 4);
		Item item9= new Item("images/b9.jpg", "Lilac Girl", "Lilac Girl", 115.0, 100, true, person9, Category.children, LocalDate.of(2018,10, 30), 20);
		Item item10= new Item("images/b10.jpg", "The Tuscan Child", "The Tuscan Child", 57.0, 100, true, person10, Category.children, LocalDate.of(2018,10, 30), 10);
		
		List<Item> booksInventory = new ArrayList<Item>();
		da.resetInventory();
		System.out.println("Saving items...");
		da.saveNewItem(item10);
		da.saveNewItem(item1);
		da.saveNewItem(item2);
		da.saveNewItem(item3);
		da.saveNewItem(item4);
		da.saveNewItem(item5);
		da.saveNewItem(item6);
		da.saveNewItem(item7);
		da.saveNewItem(item8);
		da.saveNewItem(item9);
		booksInventory = da.readItemList();
		System.out.println(booksInventory);
		
		//Books I want to buy
		Product p1 = new Product(item1,3);
		Product p2 = new Product(item4,1);
		Product p3 = new Product(item6,1);
		
		//my Shopping cart
		ShoppingCart sc1 = new ShoppingCart();
		sc1.addProducts(p1);
		sc1.addProducts(p2);
		sc1.addProducts(p3);
		
		System.out.println("Saving the Shopping Cart...");
		da.saveNewShopList(sc1);
		System.out.println("Reading the Shopping Cart...");
		ShoppingCart sc2;
		sc2 = da.readShopList();
		System.out.println(sc2.toString());
		
	}
}