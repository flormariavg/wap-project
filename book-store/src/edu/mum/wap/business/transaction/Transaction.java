package edu.mum.wap.business.transaction;

import java.util.List;

import edu.mum.wap.model.Product;
import edu.mum.wap.model.ShoppingCart;
import model.dataaccess.DataAccess;
import model.dataaccess.DataAccessFacade;

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
			book.setQuantity(book.getItem().getQuantity()-itemQty);		//Reduce inventory
			da.saveNewItem(book.getItem());
		}
		return true;
	}
}
