package project.controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import project.beans.Employee;
import project.client.VendingMachine;
import project.dao.EmployeeDAO;
import project.services.CoffeeLogic;
import project.services.Validation;


@WebServlet("/LoginValidate")
public class LoginValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger = LogManager.getLogger(VendingMachine.class);
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		Employee employeeBean = new Employee(userName, password);
		EmployeeDAO empDAO = new EmployeeDAO();
		
		HttpSession session = request.getSession();
		session.setAttribute("empId", userName);
		/////////////////////////////////////////////////////////////////////////////////////////
		
		
		
		
			System.out.println("Enter your Employee Id");
			//String empId = br.readLine();
			
			logger.info(userName + " tried using the machine");
			
			if(Validation.userExists(userName)) {
				
				logger.info(userName + " already present");
				
				System.out.println("Enter your Password");
				//String empPassword = br.readLine();
				
				
				
				if(Validation.validatePassword(userName,password)) {
					
					logger.info("Password matched and user "+userName+" is logged in");
					
					
					//send to coffee page
					RequestDispatcher rd = request.getRequestDispatcher("CoffeePage.jsp");
					
					rd.forward(request, response);
				};
				
				//send to login page
				request.setAttribute("ErrorMsg","Please enter valid credentials!!");
				RequestDispatcher rd = request.getRequestDispatcher("/Login.jsp");
				
				rd.forward(request, response);
			} 
			else {
				//send to register page
				RequestDispatcher rd = request.getRequestDispatcher("/Register.jsp");
				rd.forward(request, response);

			}

	}
}
