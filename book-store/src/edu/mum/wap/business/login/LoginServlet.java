package edu.mum.wap.business.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.mum.wap.data.DataBase;
import edu.mum.wap.model.login.User;;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
        
		Map<String, User> m= DataBase.getUsers();
		
		String name = request.getParameter("user");
		String password = request.getParameter("password");
		String remember = request.getParameter("remember");
		
		User user = m.get(name);
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
				
				response.sendRedirect("store");
				
			}else {
			session.setAttribute("loggedIn", false);
            out.print("sorry, username or password error!");  
            request.getRequestDispatcher("login.jsp").include(request, response); 
//            request.getRequestDispatcher("login.jsp").forward(request, response);
	          
	        out.close();  
			}
		}
	}

}
