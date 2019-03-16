package edu.mum.wap.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.mum.wap.model.Item;
import model.dataaccess.DataAccess;
import model.dataaccess.DataAccessFacade;

/**
 * Servlet implementation class LoadItem
 */
@WebServlet("/store")
public class LoadItem extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoadItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		
		DataAccess da = new DataAccessFacade();
		
		List<Item> products= da.readItemList();
		for (Item item : products) {
			System.out.println(item);
		}
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		request.setAttribute("products", products);
		request.getRequestDispatcher("store.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

		
	}
	

}
