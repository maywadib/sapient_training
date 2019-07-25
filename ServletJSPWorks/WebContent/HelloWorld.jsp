<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<%!public void jspInit() {
		System.out.println("Hi im from init");
	}

	public void jspDestroy() {
		System.out.println("Hi im from destroy");
	}%>



<body bgcolor="cyan">

	<h2 style="color: orange">Welcome to JSP</h2>


	<a href =  "GetEmps" > Get All Employees</a>


	<%
		Date date = new Date();
		out.print("Today is : " + date.toGMTString());
		System.out.println("Hi im from service");
	%>


</body>
</html>