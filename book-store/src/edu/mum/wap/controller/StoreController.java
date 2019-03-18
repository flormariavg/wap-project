package edu.mum.wap.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.mum.wap.dao.DataAccess;
import edu.mum.wap.dao.DataAccessFacade;
import edu.mum.wap.model.Item;
import edu.mum.wap.model.User;

/**
 * Servlet implementation class LoadItem
 */
@WebServlet("/store")
public class StoreController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StoreController() {
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
		HttpSession session= request.getSession();
		User user= (User) session.getAttribute("user");
		String name="";
		String btnLogin ="login";
		String urlLogin ="login.jsp";
		if(user!=null) {
			name="Welcome "+user.getUsername()+" !!!";
			btnLogin ="logout";
			urlLogin ="store";
		}
		request.setAttribute("name", name);
		request.setAttribute("btnLogin", btnLogin);
		request.setAttribute("urlLogin", urlLogin);
		System.out.println(name);
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		request.setAttribute("products", products);
		request.getRequestDispatcher("views/store.jsp").forward(request, response);
		
		
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
