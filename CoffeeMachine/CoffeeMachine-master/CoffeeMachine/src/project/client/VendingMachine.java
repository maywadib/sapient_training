package project.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import project.services.CoffeeLogic;
import project.services.Validation;

public class VendingMachine {
	public boolean exitMachine = false;
	public boolean isLoggedIn = false;
	
	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to the coffee vending machine");
		VendingMachine vm = new VendingMachine();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		while(!vm.exitMachine) {
			System.out.println("Enter your Employee Id");
			String empId = br.readLine();
			if(Validation.userExists(empId)) {
				System.out.println("Enter your Password");
				String empPassword = br.readLine();
				if(Validation.validatePassword(empId,empPassword)) {
					vm.isLoggedIn = true;
				};
			} else {
				System.out.println("Visiting for the first time!!");
				System.out.println("Create your password");
				String empPassword = br.readLine();
				Validation.registerUser(empId,empPassword);
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
