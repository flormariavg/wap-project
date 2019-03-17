package edu.mum.wap.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;

import edu.mum.wap.model.Product;
import edu.mum.wap.model.ShoppingCart;
import edu.mum.wap.model.login.User;
import model.dataaccess.DataAccess;
import model.dataaccess.DataAccessFacade;

@WebServlet("/checkout")
public class Checkout extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ObjectMapper mapper = new ObjectMapper();

	public Checkout() {
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
				request.getRequestDispatcher("checkout.jsp").forward(request, response);
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

		String jsonSting = request.getParameter("product");
		Product product = mapper.readValue(request.getParameter("product"), Product.class);

	}

}
