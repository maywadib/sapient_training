package project.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import org.apache.log4j.LogManager;
//import org.apache.log4j.logger;

import project.services.CoffeeLogic;
import project.services.Validation;

public class VendingMachine {
	public boolean exitMachine = false;
	public boolean isLoggedIn = false;
	
	//private static //logger //logger = LogManager.get//logger(VendingMachine.class);
	
	public static void main(String[] args) throws IOException {
		
		
		
		System.out.println("Welcome to the coffee vending machine");
		VendingMachine vm = new VendingMachine();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		while(!vm.exitMachine) {
			System.out.println("Enter your Employee Id");
			String empId = br.readLine();
			
			////logger.info(empId + " tried using the machine");
			
			if(Validation.userExists(empId)) {
				
				////logger.info(empId + " already present");
				
				System.out.println("Enter your Password");
				String empPassword = br.readLine();
				
				
				
				if(Validation.validatePassword(empId,empPassword)) {
					
					//logger.info("Password matched and user "+empId+" is logged in");
					vm.isLoggedIn = true;
				};
			} else {
				
				//logger.info( empId + " is a new user so asking for registration");
				
				System.out.println("Visiting for the first time!!");
				System.out.println("Create your password");
				String empPassword = br.readLine();
				
				
				Validation.registerUser(empId,empPassword);
				
				//logger.info("User " + empId + " has been registered successfully and the user's data has been updated in the db");
				vm.isLoggedIn = true;
			}
			
			if(vm.isLoggedIn) {
				CoffeeLogic.showMenu();
				
				int choice = Integer.parseInt(br.readLine());
				CoffeeLogic.getChoiceAndServeCoffee(empId, choice);
				System.out.println("Thanks for using the machine");
				vm.isLoggedIn = false;
			}	
		}
	}
}
