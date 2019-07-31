<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Here's your <%= request.getAttribute("coffeeName") %></h2>
	<h5>Your coffee has <%=request.getAttribute("coffeeMilkPercent") %> % milk and <%=request.getAttribute("coffeeMilkPercent") %> % coffee</h5>
	<h3>Enjoy your day!!</h3> 
	<h4>Thanks for using smart coffee machine</h4>
	<a href="Login.jsp">Go back to login page!</a>
</body>
</html>