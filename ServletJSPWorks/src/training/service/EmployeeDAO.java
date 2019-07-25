package training.service;

import java.util.List;

import training.jdbc.beans.Employee;

public class EmployeeDAO {

	//Employee isn defined in jar
	public List<Employee> getAllEmployees() {
		return new training.jdbc.dao.EmployeeDAO().getAllEmployee();
	}
	
	
	
}
