package project.services;

import project.beans.Coffee;
import project.dao.CoffeeDAO;
import project.dao.LogsDAO;

public class CoffeeLogic {
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
		if(choice == 5) servePopularCoffee(empId, choice);
		else if(choice == 6) serveEmployeeFavoriteCoffee(empId, choice);
		else serveDefaultCoffeeAndUpdateLogs(empId, choice);
	}
	
	public static void serveDefaultCoffeeAndUpdateLogs(String  empId, int coffeeId) {
		CoffeeDAO c = new CoffeeDAO();
		Coffee coffee = c.getCoffeeType(coffeeId);
		System.out.println("Your " + coffee.getCoffeeName() + " is ready!");
		System.out.println("It has a coffee ratio of " + coffee.getCoffeePercent() + " : " + coffee.getMilkPercent());
		//update log
		LogsDAO l = new LogsDAO();
		l.insertLog(empId, coffeeId);
	}
	
	public static void servePopularCoffee(String  empId, int coffeeId) {
		CoffeeDAO c = new CoffeeDAO();
		Coffee coffee = c.getPopularCoffee();
		System.out.println("Your " + coffee.getCoffeeName() + " is ready!");
		System.out.println("It has a coffee ratio of " + coffee.getCoffeePercent() + " : " + coffee.getMilkPercent()); 
		//update log
		LogsDAO l = new LogsDAO();
		l.insertLog(empId, coffeeId);
	}
	
	public static void serveEmployeeFavoriteCoffee(String  empId, int coffeeId) {
		CoffeeDAO c = new CoffeeDAO();
		Coffee coffee = c.getFavoriteCoffee(empId);
		System.out.println("Your " + coffee.getCoffeeName() + " is ready!");
		System.out.println("It has a coffee ratio of " + coffee.getCoffeePercent() + " : " + coffee.getMilkPercent());
		//update log
		LogsDAO l = new LogsDAO();
		l.insertLog(empId, coffeeId);
	}
	
	
}
