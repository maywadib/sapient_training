package project.services;

import project.beans.Employee;
import project.dao.EmployeeDAO;

public class Validation {
	public static boolean userExists(String empId) {
		EmployeeDAO e = new EmployeeDAO();
		
		if(e.getEmployee(empId) == null) return false;
		
		return true;
	}
	
	public static boolean validatePassword(String empId, String empPassword) {
		EmployeeDAO e = new EmployeeDAO();
		Employee employee = e.getEmployee(empId);
		if(employee.getempPswd().contentEquals(empPassword)) return true;
		return false;
	}
	
	public static void registerUser(String empId, String empPassword) {
		EmployeeDAO e = new EmployeeDAO();
		Employee employee = new Employee(empId,empPassword);
		e.insertEmployee(employee);
	}
}
