package project.dao;

import java.sql.SQLException;
import java.util.List;

import project.beans.Employee;
import project.connections.GetConnection;
import project.standards.IEmployeeDAO;

public class EmployeeDAO implements IEmployeeDAO{

	@Override
	public boolean insertEmployee(Employee employee) {
		String sql = "insert into employee values (?,?)";
		GetConnection gc = new GetConnection();
		
		
		try {
			gc.ps1 = GetConnection.getMySqlConnection().prepareStatement(sql);
			gc.ps1.setString(1,employee.getEmpId());
			gc.ps1.setString(2,employee.getempPswd());
			return gc.ps1.executeUpdate()>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Employee getEmployee(String empId) {
		String sql = "select empId, empPswd from employee where empId=?";
		GetConnection gc = new GetConnection();
		
		try {
			gc.ps1 = GetConnection.getMySqlConnection().prepareStatement(sql);
			gc.ps1.setString(1, empId);
			gc.rs1 = gc.ps1.executeQuery();
			
			if(gc.rs1.next()) {
				Employee e = new Employee();
				e.setEmpId(gc.rs1.getString("empId"));
				e.setEmpPswd(gc.rs1.getString("empPswd"));
				return e;
			}
		} catch(SQLException e) {
			e.printStackTrace(); 
		}
		
		return null;
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return null;
	}
	
}
