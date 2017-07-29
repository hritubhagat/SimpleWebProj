package org.bhagat.hritu.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.bhagat.hritu.dto.UserDTO;
import org.bhagat.hritu.service.UserServiceInt;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserServiceInt userService = null;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	public void setUserService(UserServiceInt userService) {
		this.userService = userService;
	}

	public void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		UserDTO dto = new UserDTO();
		UserDTO dtoExists;
		dto.setUserName(request.getParameter("username"));
		dto.setPassword(request.getParameter("password"));
		/*
		 * WebApplicationContext ctx=
		 * WebApplicationContextUtils.getWebApplicationContext
		 * (getServletContext()); userService =
		 * (UserServiceInt)ctx.getBean("userService");
		 */
		System.out.println("This is login controller");
		System.out.println("this is second line being added");
		
		
		RequestDispatcher rd = null;
		HttpSession session = null;
		try {
			System.out.println("before calling authenticate method");
			System.out.println("is user service null ::" + (userService == null));
			dtoExists = userService.authenticate(dto);
			System.out.println("after calling authenticate method");
			if (dtoExists != null) {
				session = request.getSession();
				session.setAttribute("user", dtoExists);
				rd = request.getRequestDispatcher("welcome.jsp");
			} else {
				rd = request.getRequestDispatcher("login.jsp");
				request.setAttribute("error", "Invalid username/password");
			}

		} catch (Exception e) {
			System.out.println("Exception occurred" + e);
		}
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
