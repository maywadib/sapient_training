package project.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project.beans.Employee;
import project.dao.EmployeeDAO;

@WebServlet("/UserRegister")
public class UserRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		Employee employeeBean = new Employee(userName, password);
		EmployeeDAO empDAO = new EmployeeDAO();
		
		empDAO.insertEmployee(employeeBean);
		
		RequestDispatcher rd = request.getRequestDispatcher("CoffeePage.jsp");
		rd.forward(request, response);
	}

}
