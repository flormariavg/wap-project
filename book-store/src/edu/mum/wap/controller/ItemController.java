package edu.mum.wap.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.mum.wap.dao.DataAccess;
import edu.mum.wap.dao.DataAccessFacade;
import edu.mum.wap.model.Item;
import edu.mum.wap.model.Product;
import edu.mum.wap.model.ShoppingCart;
import edu.mum.wap.model.User;

/**
 * Servlet implementation class AddItem
 */
@WebServlet("/itemManager")
public class ItemController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ItemController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String action = request.getParameter("action");
		String code = request.getParameter("item");
		String quantity = request.getParameter("itemQuantity");
		
		System.out.println(code);
		System.out.println(quantity);
		
		HttpSession session = request.getSession();
		ShoppingCart shoppingCart = (ShoppingCart) session.getAttribute("shoppingCart");
		
		if (session.getAttribute("shoppingCart") == null)
			shoppingCart = new ShoppingCart();
		
		DataAccess da = new DataAccessFacade();
		
		Item item = da.findItemByCode(code);
		Product product = new Product();
		product.setItem(item);
		
		
		if(action.equals("add")) {
			product.setQuantity(1);
			shoppingCart.addProducts(product);
			System.out.println("shoppingCart" + shoppingCart);
			session.setAttribute("shoppingCart", shoppingCart);
		}else {
			product.setQuantity(Integer.parseInt(quantity));
			shoppingCart.delete(product);
			session.setAttribute("shoppingCart", shoppingCart);
			
			User user= (User) session.getAttribute("user");
			if(user!=null) {
				da.saveNewShopList(shoppingCart);
			}
			
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
