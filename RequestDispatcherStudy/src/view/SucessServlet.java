package view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SucessServlet")
public class SucessServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String obtainedUname = (String) request.getAttribute("USERNAME");
		Double d = (Double) request.getAttribute("PI");
		Boolean isMarried = (Boolean) request.getAttribute("ISMARRIED");
		Integer age = (Integer) request.getAttribute("AGE");

		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Valid  User </h1>");
		out.println("<h1>Hi," + obtainedUname + "</h1>");
		out.println("<br>Pi Value " + d);
		out.println("<br>Is Married " + isMarried);
		out.println("<br>Age " + age);

		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
