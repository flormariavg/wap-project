package model.dataaccess;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import edu.mum.wap.model.Product;
import edu.mum.wap.model.ShoppingCart;

public class DataAccessFacade implements DataAccess {

	enum StorageType {
		PRODUCTS, CARTLINES, SHOPPINGCARTS;
	}

	public static final String OUTPUT_DIR = System.getProperty("user.dir")
			+ "\\src\\model\\dataaccess\\storage";
	public static final String DATE_PATTERN = "MM/dd/yyyy";

	static void saveToStorage(StorageType type, Object ob) {
		ObjectOutputStream out = null;
		try {
			Path path = FileSystems.getDefault().getPath(OUTPUT_DIR, type.toString());
			out = new ObjectOutputStream(Files.newOutputStream(path));
			out.writeObject(ob);
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			if(out != null) {
				try {
					out.close();
				} catch(Exception e) {}
			}
		}
	}

	static Object readFromStorage(StorageType type) {
		ObjectInputStream in = null;
		Object retVal = null;
		try {
			Path path = FileSystems.getDefault().getPath(OUTPUT_DIR, type.toString());
			in = new ObjectInputStream(Files.newInputStream(path));
			retVal = in.readObject();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(in != null) {
				try {
					in.close();
				} catch(Exception e) {}
			}
		}
		return retVal;
	}

	public void saveNewProduct(Product p) {
	    List<Product> products = readProdsList();
	    //String ProdId = p.getProduct().getCode();
	    products.add(p);
	    saveToStorage(StorageType.PRODUCTS,products);
	}
	
	@SuppressWarnings("unchecked")
	public List<Product> readProdsList() {
		//Returns a product list
		return (List<Product>) readFromStorage(StorageType.PRODUCTS);
	}
	
//	public void saveNewCartLine(CartLine cl) {
//	    List<CartLine> cartLines = readCartLines();
//	    cartLines.add(cl);
//	    saveToStorage(StorageType.CARTLINES,cartLines);
//	}
//	
//	@SuppressWarnings("unchecked")
//	public List<CartLine> readCartLines() {
//		//Returns a product list
//		return (List<CartLine>) readFromStorage(StorageType.CARTLINES);
//	}

	public void saveNewShopList(ShoppingCart sc) {
		ShoppingCart ShopCarts = readShopList();
		ShopCarts=sc;
	    saveToStorage(StorageType.SHOPPINGCARTS,ShopCarts);
	}
	
	public ShoppingCart readShopList() {
		//Returns a product list
		return (ShoppingCart) readFromStorage(StorageType.SHOPPINGCARTS);
	}
}
