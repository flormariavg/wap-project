package edu.mum.wap.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.mum.wap.model.Product;
import edu.mum.wap.model.ShoppingCart;

/**
 * Servlet implementation class Cart
 */
@WebServlet("/cart")
public class CartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		HttpSession session= request.getSession();
		
		ShoppingCart shoppingCart= (ShoppingCart) session.getAttribute("shoppingCart");
		
		if(session.getAttribute("shoppingCart")!=null) {
			System.out.println("Cart********************************");
			System.out.println("shoppingCart"+shoppingCart);
			shoppingCart.calculatedTotalPrice();
			shoppingCart.calculateShipping();
			request.setAttribute("shoppingCart", shoppingCart);
			
		}else
		{
			System.out.println("No Shopping cart, creating empty");
			request.setAttribute("shoppingCart", new ShoppingCart());
		}
		request.getRequestDispatcher("views/shopping-cart.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
