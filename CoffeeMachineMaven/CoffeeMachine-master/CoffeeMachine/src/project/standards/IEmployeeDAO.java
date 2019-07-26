package project.standards;

import java.util.List;

import project.beans.Employee;

public interface IEmployeeDAO {
	public boolean insertEmployee(Employee employee);
	
	public Employee getEmployee(String empId);
	public List<Employee> getAllEmployee();
}
