package training.servlets.basics.standards;

import java.util.List;

import training.servlets.basics.EData;

public interface IEmployeeDAO {

	//CRUD - create , read, read, update, delete
	
	public boolean insertEmployee(EData employee) throws Exception;
	public boolean deleteEmployee(int empId);
	public boolean updateEmployee(int empId, double newSalary);
	
	//select
	
	public EData getEmployee(int empId);
	public List<EData> getAllEmployee();
	
	
}
