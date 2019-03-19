package edu.mum.wap.business;

import java.util.ArrayList;
import java.util.List;

import edu.mum.wap.dao.DataAccess;
import edu.mum.wap.dao.DataAccessFacade;
import edu.mum.wap.model.Item;
import edu.mum.wap.model.Product;
import edu.mum.wap.model.ShoppingCart;

public class Transaction {
	
	public boolean commitTransaction(ShoppingCart spCart) {
		DataAccess da = new DataAccessFacade();
		List<Product> prodList=spCart.getProducts();
		int itemQty = 0;
		
		for (Product book:prodList) {
			//For each product in Shopping Cart, checks for availability in inventory
			itemQty = book.getQuantity();								//# books bought in this transaction
			if (book.getItem().getQuantity() < itemQty)
				return false;											//Transaction is not possible, no inventory, rollback and return
		}
		//Transaction is possible, so do it
		//Reset all inventory first (save it all at once with remaining existences)
		da.resetInventory();
		for (Product book:prodList) {
			//For each product in Shopping Cart, affect the inventory reducing quantity
			itemQty = book.getQuantity();								//# books bought in this transaction
			book.getItem().setQuantity(book.getItem().getQuantity()-itemQty);		//Reduce inventory
			da.saveNewItem(book.getItem());
		}
		System.out.println("==============Despues de transaccion============");
		List<Item> products= da.readItemList();
		for (Item item : products) {
			System.out.println(item);
		}
		return true;
	}
}
