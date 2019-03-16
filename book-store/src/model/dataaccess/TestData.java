package model.dataaccess;

import edu.mum.wap.model.Item;
import edu.mum.wap.model.Product;
import edu.mum.wap.model.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class TestData {

	public static void main(String[] args) {
		DataAccess da = new DataAccessFacade();
		
		//Books inventory
		Item item1= new Item("B0001", "My secret life", 10, 10, true);
		Item item2= new Item("B0002", "The Girl Who Lived", 14.39, 20, true);
		Item item3= new Item("B0003", "Before We Were Yours", 14.77, 2, true);
		Item item4= new Item("B0004", "Spilled Milk", 17.99, 12, true);
		Item item5= new Item("B0005", "The Storyteller's Secret", 7.48, 0, false);
		Item item6= new Item("B0006", "All the Light We Cannot See", 12.99, 32, true);
		Item item7= new Item("B0007", "The Life We Bury", 8.99, 15, true);
		Item item8= new Item("B0008", "The Next Person You Meet in Heaven", 12.22, 41, true);
		Item item9= new Item("B0009", "Lilac Girl", 17.68, 24, true);
		Item item10= new Item("B0010", "The Tuscan Child", 11.99, 1, true);
		
		List<Item> booksInventory = new ArrayList<Item>();
		System.out.println("Saving items...");
		da.saveNewItem(item1);
		da.saveNewItem(item2);
		da.saveNewItem(item3);
		da.saveNewItem(item4);
		da.saveNewItem(item5);
		da.saveNewItem(item6);
		da.saveNewItem(item7);
		da.saveNewItem(item8);
		da.saveNewItem(item9);
		da.saveNewItem(item10);
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