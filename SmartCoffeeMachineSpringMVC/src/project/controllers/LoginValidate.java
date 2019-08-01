package project.controllers;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import project.beans.Employee;
import project.client.VendingMachine;
import project.dao.EmployeeDAO;
import project.services.CoffeeLogic;
import project.services.Validation;


@Controller
public class LoginValidate  {
	
	@RequestMapping(value="/login")
	public String showLoginPage() {
		return "Login";
	}
	
	private static final long serialVersionUID = 1L;
	//private static Logger logger = LogManager.getLogger(VendingMachine.class);
	
	
	@RequestMapping(value = "/loginpage", method = RequestMethod.POST)
	public String doPost(HttpServletRequest request, HttpServletResponse response) {

		System.out.println("in login validate");
		
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		Employee employeeBean = new Employee(userName, password);
		EmployeeDAO empDAO = new EmployeeDAO();
		
		HttpSession session = request.getSession();
		session.setAttribute("empId", userName);
		/////////////////////////////////////////////////////////////////////////////////////////
		
		
		
		
			System.out.println("Enter your Employee Id");
			//String empId = br.readLine();
			
			//logger.info(userName + " tried using the machine");
			
			if(Validation.userExists(userName)) {
				
			//	logger.info(userName + " already present");
				
				System.out.println("Enter your Password");
				//String empPassword = br.readLine();
				
				
				
				if(Validation.validatePassword(userName,password)) {
					
				//	logger.info("Password matched and user "+userName+" is logged in");
					
					
					//send to coffee page
//					RequestDispatcher rd = request.getRequestDispatcher("CoffeePage.jsp");
//					
//					rd.forward(request, response);
					
					
					return "CoffeePage";
					
				};
				
				//send to login page
				request.setAttribute("ErrorMsg","Please enter valid credentials!!");
//				RequestDispatcher rd = request.getRequestDispatcher("/Login.jsp");
//				
//				rd.forward(request, response);
				
				return "Login";
				
			} 
			else {
				//send to register page
//				RequestDispatcher rd = request.getRequestDispatcher("/Register.jsp");
//				rd.forward(request, response);
				
				return "Register";
				

			}

	}
}
