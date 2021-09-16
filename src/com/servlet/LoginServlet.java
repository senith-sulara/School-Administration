package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Admin;
import com.service.AdminService;
import com.service.AdminServiceImpl;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
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
		AdminService adminservice = new AdminServiceImpl();
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		Admin a = adminservice.login(userName, password);
		
		if(a!=null && a.getUserName() != null) {
			HttpSession session = request.getSession();
			session.setAttribute("logperson", a);
			response.sendRedirect("AdminHome.jsp");
		}
		else {
			request.setAttribute("message", "Username or Password Incorrect!!!");
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/AdminLogin.jsp");
			dispatcher.forward(request, response);
		}
	}

}
