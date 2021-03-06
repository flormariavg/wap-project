package edu.mum.wap.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.mum.wap.dao.DataAccess;
import edu.mum.wap.dao.DataAccessFacade;
import edu.mum.wap.dao.DataBase;
import edu.mum.wap.model.Product;
import edu.mum.wap.model.ShoppingCart;
import edu.mum.wap.model.User;;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        
        DataAccess da = new DataAccessFacade();
        
		String name = request.getParameter("user");
		String password = request.getParameter("password");
		String remember = request.getParameter("remember");
		
		User user = da.findUserByUsername(name);
		
		System.out.println("User: "+user);
		
//		HttpSession session= request.getSession();
		if(user!=null) {
			HttpSession session= request.getSession();
			if(user.getPassword().equals(password)) {
				session.setAttribute("loggedIn", true);
				session.setAttribute("user", user);
				int month=0;
				System.out.println("remember:"+remember);
				if("on".equals(remember)) {
					System.out.println("entrooo");
					month=30*24*60*60;
					Cookie cookie= new Cookie("username",name);
					cookie.setMaxAge(month);
					response.addCookie(cookie);
					
					Cookie promo= new Cookie("promo","100");
					promo.setMaxAge(month);
					response.addCookie(promo);
					
				}else {
					Cookie cookie= new Cookie("username",null);
					cookie.setMaxAge(month);
					response.addCookie(cookie);
				}
				
				String redirect="store";
				ShoppingCart shoppingCartSession = (ShoppingCart) session.getAttribute("shoppingCart");
				
				ShoppingCart shoppingCart = da.readShopList();
				
				if(shoppingCartSession!=null) {
					List<Product>products=shoppingCartSession.getProducts();
					for (Product product : products) {
						shoppingCart.addProducts(product);
					}
					redirect="cart";
				}
				
				
				session.setAttribute("shoppingCart", shoppingCart);
				
				System.out.println("****************");
				
				response.sendRedirect(redirect);
				
			}else {
			session.setAttribute("loggedIn", false);
            out.print("sorry, username or password error!");  
            request.getRequestDispatcher(""
            		+ "login.jsp").include(request, response); 
//            request.getRequestDispatcher("login.jsp").forward(request, response);
	          
	        out.close();  
			}
		}else {
			request.getRequestDispatcher(""
            		+ "login.jsp").include(request, response); 
		}
	}

}
