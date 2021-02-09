package com.ethioclick.test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegistrationHandler
 */
public class RegistrationHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationHandler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		User user=new User();
		user.setName(request.getParameter("username"));
		user.setSex(request.getParameter("sex"));
		String[] foods= request.getParameterValues("ffood");
		user.setFoods(Arrays.toString(foods));
		user.setCountry(request.getParameter("country"));
		user.setRemarks(request.getParameter("remarks"));
		
		DAO dao=new DAO();
		boolean issaved = dao.save(user);
		if(issaved) {
			List<User>allusers=dao.getAll();
			HttpSession session = request.getSession();
			session.setAttribute("users", allusers);
			response.sendRedirect("dashboard.jsp");
			
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("errorInfo", "Unable to save or fetch");
			
			response.sendRedirect("error.jsp");
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
