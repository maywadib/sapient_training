package project.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.mysql.cj.Session;

import project.beans.Coffee;
import project.client.VendingMachine;
import project.dao.CoffeeDAO;
import project.dao.LogsDAO;

/**
 * Servlet implementation class CoffeePage
 */
@WebServlet("/CoffeePage")
public class CoffeePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger = LogManager.getLogger(VendingMachine.class);
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String interest = request.getParameter("coffee");
		HttpSession session = request.getSession(false);
		String empId = (String)session.getAttribute("empId");
		
		CoffeeDAO c = new CoffeeDAO();
		Coffee coffee = null;
		if(interest.equals("cappuccino")){
			
			coffee = c.getCoffeeType(1);
			
			logger.info("Coffee " + coffee.getCoffeeName() + " selected by the user " + empId);
			
			System.out.println("Your " + coffee.getCoffeeName() + " is ready!");
			System.out.println("It has a coffee ratio of " + coffee.getCoffeePercent() + " : " + coffee.getMilkPercent());
			//update log
			LogsDAO l = new LogsDAO();
			l.insertLog(empId, 1);
			
			logger.info("Coffee has been served successfully for the user " + empId);
		}else if(interest.equals("espresso")) {
			coffee = c.getCoffeeType(2);
			
			logger.info("Coffee " + coffee.getCoffeeName() + " selected by the user " + empId);
			
			System.out.println("Your " + coffee.getCoffeeName() + " is ready!");
			System.out.println("It has a coffee ratio of " + coffee.getCoffeePercent() + " : " + coffee.getMilkPercent());
			//update log
			LogsDAO l = new LogsDAO();
			l.insertLog(empId, 2);
			
			logger.info("Coffee has been served successfully for the user " + empId);
		}else if(interest.equals("latte")) {
			coffee = c.getCoffeeType(3);
			
			logger.info("Coffee " + coffee.getCoffeeName() + " selected by the user " + empId);
			
			System.out.println("Your " + coffee.getCoffeeName() + " is ready!");
			System.out.println("It has a coffee ratio of " + coffee.getCoffeePercent() + " : " + coffee.getMilkPercent());
			//update log
			LogsDAO l = new LogsDAO();
			l.insertLog(empId, 3);

		}else if(interest.equals("filtercoffee")) {
			coffee = c.getCoffeeType(4);
			
			logger.info("Coffee " + coffee.getCoffeeName() + " selected by the user " + empId);
			
			System.out.println("Your " + coffee.getCoffeeName() + " is ready!");
			System.out.println("It has a coffee ratio of " + coffee.getCoffeePercent() + " : " + coffee.getMilkPercent());
			//update log
			LogsDAO l = new LogsDAO();
			l.insertLog(empId, 4);
			
		}else if(interest.equals("popcoffee")) {
			
			coffee = c.getPopularCoffee();
			
			System.out.println("Most popular coffee recommendation for today :" + coffee.getCoffeeName());
			
			System.out.println("Your " + coffee.getCoffeeName() + " is ready!");
			System.out.println("It has a coffee ratio of " + coffee.getCoffeePercent() + " : " + coffee.getMilkPercent()); 
			//update log
			LogsDAO l = new LogsDAO();
			l.insertLog(empId, coffee.getCoffeeId());
		}else if(interest.equals("favcoffee")) {
			
			coffee = c.getFavoriteCoffee(empId);
			
			System.out.println("Your favorite coffee recommendation :" + coffee.getCoffeeName());
			
			System.out.println("Your " + coffee.getCoffeeName() + " is ready!");
			System.out.println("It has a coffee ratio of " + coffee.getCoffeePercent() + " : " + coffee.getMilkPercent());
			//update log
			LogsDAO l = new LogsDAO();
			l.insertLog(empId, coffee.getCoffeeId());
		}
		
		
		
		request.setAttribute("coffeeName", coffee.getCoffeeName());
		request.setAttribute("coffeeMilkPercent", coffee.getMilkPercent());
		request.setAttribute("coffeeCoffeePercent", coffee.getCoffeePercent());
		RequestDispatcher rd1 = request.getRequestDispatcher("SelectedChoice.jsp");
		rd1.include(request, response);
		//rd.forward(request, response);
	}

}
