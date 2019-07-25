package training.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import training.jdbc.beans.Employee;
import training.jdbc.dao.EmployeeDAO;

@WebServlet("/GetEmps")
public class GetAllEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//service
		List<Employee> emps = new EmployeeDAO().getAllEmployee();

		System.out.println(emps);
		String path = "/WEB-INF/views/ShowEmps.jsp";

		request.setAttribute("EMPS", emps);
		request.getRequestDispatcher(path).forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
