<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>





<%
	HttpSession mySession = request.getSession();
	if(mySession.isNew()) {
		%>
		<p> Hi user Welcome for the first time </p>
		
		<%
	} else {
		%>
		<p> Hi User Welcome Back!!! </p>
		<p> You Session Id is : <%= mySession.getId()%> </p> 
		<p> Creation Time <%= mySession.getCreationTime() %> </p> 
		<p> Last Access time <%= mySession.getLastAccessedTime()%> </p> 
		<p> Max Inactive time <%= mySession.getMaxInactiveInterval()%> </p> 
		<%
		
	}
%>
</body>
</html>