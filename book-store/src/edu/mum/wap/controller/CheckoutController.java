package edu.mum.wap.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;

import edu.mum.wap.business.Transaction;
import edu.mum.wap.dao.DataAccess;
import edu.mum.wap.dao.DataAccessFacade;
import edu.mum.wap.model.Order;
import edu.mum.wap.model.ShoppingCart;
import edu.mum.wap.model.User;

@WebServlet("/checkout")
public class CheckoutController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ObjectMapper mapper = new ObjectMapper();

	public CheckoutController() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		HttpSession session = request.getSession();
		
		if(session.getAttribute("loggedIn")==null)
			session.setAttribute("loggedIn", false);
		
		if(session.getAttribute("loggedIn").equals(true)) {
			ShoppingCart shoppingCart = (ShoppingCart) session.getAttribute("shoppingCart");
			if (session.getAttribute("shoppingCart") != null) {
				System.out.println("Cart********************************");
				System.out.println("shoppingCart" + shoppingCart);

				User user = (User) session.getAttribute("user");
				System.out.println("username"+user.getUsername());
				shoppingCart.setUser(user);
				
				shoppingCart.calculatedTotalPrice();
				shoppingCart.calculateShipping();

				System.out.println("shoppingCart"+shoppingCart);
				
				
				DataAccess da = new DataAccessFacade();
				da.saveNewShopList(shoppingCart);
				
				ShoppingCart shoppingCart2 = da.readShopList();
				
				System.out.println("****************");
				System.out.println("shoppingCart 2: "+shoppingCart2);
				
//				private User user;
//				List<Product> products;
//				private int totalItems = 0;
//				private Double totalPrice = 0.0;
//				private Double shipping;
//				
				request.getRequestDispatcher("WEB-INF/views/checkout.jsp").forward(request, response);
			} else {
				System.out.println("Error****************");

			}
			
		}else
			request.getRequestDispatcher("login.jsp").forward(request, response);
		
		
		
		//		request.getRequestDispatcher("checkout.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Proceed checkout :::: ");

		String jsonSting = request.getParameter("order");
		System.out.println(jsonSting);
		
		Order order = mapper.readValue(jsonSting, Order.class);
		
		HttpSession session = request.getSession();
		ShoppingCart shoppingCart = (ShoppingCart) session.getAttribute("shoppingCart");
		
		order.setShoppingCart(shoppingCart);
		
		boolean result = new Transaction().commitTransaction(shoppingCart);
		System.out.println(order);
		System.out.println("Tx result : "+result);

	}

}
