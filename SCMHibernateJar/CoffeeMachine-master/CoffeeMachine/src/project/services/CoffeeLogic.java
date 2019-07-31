package project.services;

//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;

import project.beans.Coffee;
import project.dao.CoffeeDAO;
import project.dao.LogsDAO;

public class CoffeeLogic {
	
	//private static Logger logger = LogManager.getLogger(CoffeeLogic.class);
	
	public static void showMenu() {
		System.out.println("*** Welcome ***");
		System.out.println("1. Cappuccino");
		System.out.println("2. Latte");
		System.out.println("3. Espresso");
		System.out.println("4. Filter Coffee");
		System.out.println("5. Serve me my favorite");
		System.out.println("6. Serve the most popular coffee choice");
	}
	
	public static void getChoiceAndServeCoffee(String empId, int choice) {
		if(choice == 6) servePopularCoffee(empId, choice);
		else if(choice == 5) serveEmployeeFavoriteCoffee(empId, choice);
		else serveDefaultCoffeeAndUpdateLogs(empId, choice);
	}
	
	public static void serveDefaultCoffeeAndUpdateLogs(String  empId, int coffeeId) {
		CoffeeDAO c = new CoffeeDAO();
		Coffee coffee = c.getCoffeeType(coffeeId);
		
		//logger.info("Coffee " + coffee.getCoffeeName() + " selected by the user " + empId);
		
		System.out.println("Your " + coffee.getCoffeeName() + " is ready!");
		System.out.println("It has a coffee ratio of " + coffee.getCoffeePercent() + " : " + coffee.getMilkPercent());
		//update log
		LogsDAO l = new LogsDAO();
		l.insertLog(empId, coffeeId);
		
		//logger.info("Coffee has been served successfully for the user " + empId);

	}
	
	public static void servePopularCoffee(String  empId, int coffeeId) {
		CoffeeDAO c = new CoffeeDAO();
		Coffee coffee = c.getPopularCoffee();
		
		System.out.println("Most popular coffee recommendation for today :" + coffee.getCoffeeName());
		
		System.out.println("Your " + coffee.getCoffeeName() + " is ready!");
		System.out.println("It has a coffee ratio of " + coffee.getCoffeePercent() + " : " + coffee.getMilkPercent()); 
		//update log
		LogsDAO l = new LogsDAO();
		l.insertLog(empId, coffee.getCoffeeId());
	}
	
	public static void serveEmployeeFavoriteCoffee(String  empId, int coffeeId) {
		CoffeeDAO c = new CoffeeDAO();
		Coffee coffee = c.getFavoriteCoffee(empId);
		
		System.out.println("Your favorite coffee recommendation :" + coffee.getCoffeeName());
		
		System.out.println("Your " + coffee.getCoffeeName() + " is ready!");
		System.out.println("It has a coffee ratio of " + coffee.getCoffeePercent() + " : " + coffee.getMilkPercent());
		//update log
		LogsDAO l = new LogsDAO();
		l.insertLog(empId, coffee.getCoffeeId());
	}
	
	
}
