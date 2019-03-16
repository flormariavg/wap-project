package edu.mum.wap.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;

import edu.mum.wap.model.Product;
import edu.mum.wap.model.ShoppingCart;

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

		ShoppingCart shoppingCart = (ShoppingCart) session.getAttribute("shoppingCart");
		if (session.getAttribute("shoppingCart") != null) {
			System.out.println("Cart********************************");
			System.out.println("shoppingCart" + shoppingCart);

			shoppingCart.calculatedTotalPrice();
			shoppingCart.calculateShipping();

			request.getRequestDispatcher("checkout.jsp").forward(request, response);
		} else {
			System.out.println("Error****************");

		}

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
