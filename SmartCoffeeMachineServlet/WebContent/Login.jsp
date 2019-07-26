<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Welcome to the Coffee Vending Machine</h1>
	<h2>Enter your Credentials</h2>
	<%if(request.getAttribute("ErrorMsg")!=null){ %>
	
	<%= request.getAttribute("ErrorMsg") %>
	
	<% }%>
	<form action  = "LoginValidate" method="post">
		<p>Username : <input type="text" name="username"></p>
		<p>Password : <input type="text" name="password"></p>
		<p><input type="submit">
		
		</p>
	</form>
	<button><a href="Register.jsp">I'm new, I want to sign up!</a></button>

</body>
</html>