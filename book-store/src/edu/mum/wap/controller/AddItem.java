package edu.mum.wap.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.mum.wap.model.Item;
import edu.mum.wap.model.Product;
import edu.mum.wap.model.ShoppingCart;
import model.dataaccess.DataAccess;
import model.dataaccess.DataAccessFacade;

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
		String code = request.getParameter("item");
		DataAccess da = new DataAccessFacade();
		Item item = da.findItemByCode(code);
		Product product= new Product();
		product.setItem(item);
		product.setQuantity(1);
		
		HttpSession session= request.getSession();
		
		ShoppingCart shoppingCart= (ShoppingCart) session.getAttribute("shoppingCart");
		if(session.getAttribute("shoppingCart")==null)
			shoppingCart= new ShoppingCart();
		
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
