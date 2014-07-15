<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>JSP Page Study</h1>

	<%
		int i = 34;
		int j = 12;
		int sum = i + j;
	%>

	Output :
	<h1>
		<font color='red'> <%
 	out.println("Sum  " + sum);
 %>
		</font>
	</h1>

	<hr>

	<form action="index.jsp">
		Name <input type="text" name="username"><br> <input
			type="submit">
	</form>

	<%
		String uname = request.getParameter("username");
		out.println("Your Name is : " + uname);
	%>

	<%
		Date d = new Date();
		out.println("<br>Date is " + d.toString());
	%>

	<hr>

	Lets Study Loops

	<%
		for (int x = 1; x <= 10; x++) {
			out.println("<br>Apple");
		}
	%>
	<hr>
	<ol>
		<%
			for (int x = 1; x <= 10; x++) {
				out.println("<li>Apple</li>");
			}
		%>

	</ol>

	<%
		String[] words = { "Fish", "Banana", "Cat", "Science", "Insect",
				"Study", "Umesh", "Elephant" };
	%>
	<hr>
	<center>
		<table width="40%" bgcolor="yellow">
			<%
				for (int y = 0; y < words.length; y++) {
					out.println("	<tr><td>" + y + "</td><td>" + words[y]
							+ "</td></tr>");
				}
			%>

		</table>

		<hr>

		<select>
			<%
				for (int y = 0; y < words.length; y++) {
					out.println("<option>" + words[y] + "</option>");
				}
			%>

		</select> <br> <br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>

	</center>


</body>
</html>