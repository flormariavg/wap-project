package edu.mum.wap.dao;

import java.util.List;

import edu.mum.wap.model.Item;
import edu.mum.wap.model.Product;
import edu.mum.wap.model.ShoppingCart;
import edu.mum.wap.model.User;

public interface DataAccess {
	public void saveNewProduct(Product p);
//	public void saveNewCartLine(CartLine cl);
	public void saveNewShopList(ShoppingCart sc);
	public List<Product> readProdsList();
//	public List<CartLiSOne> readCartLines();
	public ShoppingCart readShopList();
	public void saveNewItem(Item i);
	public List<Item> readItemList();
	public Item findItemByCode(String code);
	public void resetInventory();
	public void saveNewUser(User user);
	public List<User> readUserList();
	public User findUserByUsername(String username);
}
