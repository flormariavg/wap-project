package edu.mum.wap.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.mum.wap.model.Item;
import edu.mum.wap.model.Product;
import edu.mum.wap.model.ShoppingCart;

/**
 * Servlet implementation class AddItem
 */
@WebServlet("/addItem")
public class AddItem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddItem() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(request.getParameter("item"));
		
		Item item= new Item();
		List<Item> products = Product.setItems();
		for (Item item2 : products) {
			if(item2.getCode().equals(request.getParameter("item"))) {
				item= item2;
				break;
			}
			
		}
		
		
		Product product= new Product();
		product.setItem(item);
		product.setQuantity(1);
		
		HttpSession session= request.getSession();
		
		ShoppingCart shoppingCart= (ShoppingCart) session.getAttribute("shoppingCart");
		if(session.getAttribute("shoppingCart")==null)
			shoppingCart= new ShoppingCart();
		
		shoppingCart.addProducts(product);
		shoppingCart.addProducts(product);
		
		System.out.println("shoppingCart"+shoppingCart);
		
		session.setAttribute("shoppingCart", shoppingCart);
		
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.sendRedirect("store");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
