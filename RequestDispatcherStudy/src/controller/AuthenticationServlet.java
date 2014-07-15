package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AuthenticationServlet
 */
@WebServlet("/AuthenticationServlet")
public class AuthenticationServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (password.equals("123")) {
			// good user
			
			request.setAttribute("USERNAME", username);
			request.setAttribute("PI", 3.146588);
			request.setAttribute("ISMARRIED", false);
			request.setAttribute("AGE", 12);
			
			
			RequestDispatcher chitthiGood = request
					.getRequestDispatcher("SucessServlet");
			chitthiGood.forward(request, response);
		} else {
			// bad user

//			RequestDispatcher chitthiBad = request
//					.getRequestDispatcher("FailureServlet");
//			chitthiBad.forward(request, response);
			
			response.sendRedirect("http://www.facebook.com");
		}

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

}
