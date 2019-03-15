package edu.mum.wap.business.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Logout
 */
@WebServlet("/logoutServlet")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Logout() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		// TODO Auto-generated method stub
//
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//
//		request.getRequestDispatcher("login.jsp").include(request, response);
//
//		for (Cookie cookie : request.getCookies()) {
//			if (cookie.getName().equals("name")) {
//				String userName = cookie.getValue();
//				System.out.println("username: "+userName);
//			}
//		}
//
//		out.print("You are successfully logged out!");

		HttpSession session = request.getSession();
		session.invalidate();
		response.sendRedirect("login.jsp");
//		out.close();
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
