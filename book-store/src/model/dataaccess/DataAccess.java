package model.dataaccess;

import java.util.List;

import edu.mum.wap.model.Product;
import edu.mum.wap.model.ShoppingCart;

public interface DataAccess {
	public void saveNewProduct(Product p);
//	public void saveNewCartLine(CartLine cl);
	public void saveNewShopList(ShoppingCart sc);
	public List<Product> readProdsList();
//	public List<CartLiSOne> readCartLines();
	public ShoppingCart readShopList();
}
