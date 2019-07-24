package training.servlets.basics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import training.servlets.basics.dao.EmployeeDAO;
import training.servlets.basics.standards.IEmployeeDAO;


@WebServlet("/GetData")
public class GetData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<table border=\"3\">");
		out.print("<tr>" + 
				"	<td>Employee Name</td>" + 
				"	<td>Employee Email</td>" + 
				"	<td>Employee Id</td>" + 
				"</tr>");
		
		for(EData temp : Dataobjects.emps) {
			out.print("<tr>" + 
					"	<td>" + temp.geteName() + "</td>" + 
					"	<td>"+ temp.geteEmail() +"</td>" + 
					"	<td>"+ temp.geteId() +"</td>" + 
					"</tr>");
		}
		
		out.print("</table>");
		
		IEmployeeDAO dao = new EmployeeDAO();
		System.out.println(dao.getAllEmployee());
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
