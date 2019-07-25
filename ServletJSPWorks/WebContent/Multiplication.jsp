<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



	<%@ include file="MultiplicationForm.jsp"%>


	<h2>Multiplication Table</h2>

	<table border="3" border="cyan">
		<%
			try {

				int val = Integer.parseInt(request.getParameter("val"));

				out.println("Multiplication Table for " + val);
				for (int i = 1; i <= 10; i++) {
		%>

		<tr>
			<td>
				<!--  			out.println(val + " X " + i + " = " + (val * i)); --> <%=val%>
				X <%=i%> = <%=val * i%>

			</td>
		</tr>

		<%
			}
			} catch (Exception e) {
				out.println("Sorry boss!!! Give Integer");
			}
		%>
	</table>
</body>
</html>