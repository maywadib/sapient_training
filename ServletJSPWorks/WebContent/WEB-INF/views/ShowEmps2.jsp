<%@page import="training.jdbc.beans.Employee"%>
<%@page import="java.util.List"%>
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
	List<Employee> list = (List<Employee>) request.getAttribute("EMPS");

for(Employee temp : list) {
	%>
	
	
	<tr>
		<td><%= temp.getEmpId() %></td>
		<td><%= temp.getEmpName() %></td>
		<td><%= temp.getEmpEmail() %></td>
		<td><%= temp.getEmpDob() %></td>
		<td><%= temp.getDepartmentId() %></td>
		<td><%= temp.getEmpSalary() %></td>
	
	</tr>
	
	<%
}
%>
</body>
</html>