package project.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import project.beans.Employee;
import project.dao.EmployeeDAO;

@Controller
public class UserRegister  {
	private static final long serialVersionUID = 1L;
 
	
	@RequestMapping(value = "/registerpage", method = RequestMethod.POST)
	public ModelAndView doPost(HttpServletRequest request, HttpServletResponse response){
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		Employee employeeBean = new Employee(userName, password);
		EmployeeDAO empDAO = new EmployeeDAO();
		
		empDAO.insertEmployee(employeeBean);
		
		
		return new ModelAndView("CoffeePage");
		
//		RequestDispatcher rd = request.getRequestDispatcher("CoffeePage.jsp");
//		rd.forward(request, response);
	}

}
