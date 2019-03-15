package model.dataaccess;

import edu.mum.wap.model.Item;
import edu.mum.wap.model.Product;
import edu.mum.wap.model.ShoppingCart;

public class TestData {

	public static void main(String[] args) {
		//Books inventory
		Item item= new Item("book1", "Science Fiction", 10, 2, true);
		Item item2= new Item("book2", "Technology", 10, 2, true);
		Item item3= new Item("book3", "Stories", 10, 2, true);
		Item item4= new Item("book4", "Health", 10, 2, true);
		
		//Books I want to buy
		Product p1 = new Product(item,1);
		Product p2 = new Product(item2,2);
		Product p3 = new Product(item3,4);
		
		//my CartLine
//		CartLine cart1 = new CartLine();
//		
//		cart1.addProducts(p1);
//		cart1.addProducts(p2);
//		cart1.addProducts(p3);
		
		//my Shopping cart
		ShoppingCart sc1 = new ShoppingCart();
		sc1.addProducts(p1);
		sc1.addProducts(p2);
		sc1.addProducts(p3);
		
		DataAccess da = new DataAccessFacade();
		System.out.println("Saving the Shopping Cart...");
		da.saveNewShopList(sc1);
		System.out.println("Reading the Shopping Cart...");
		ShoppingCart sc2;
		sc2 = da.readShopList();
		System.out.println(sc2.toString());
	}
}