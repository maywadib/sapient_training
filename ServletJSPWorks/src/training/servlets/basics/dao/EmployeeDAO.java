package training.servlets.basics.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import training.servlets.basics.EData;
import training.servlets.basics.connection.GetConnection;
import training.servlets.basics.standards.IEmployeeDAO;


public class EmployeeDAO implements IEmployeeDAO {

	@Override
	public boolean insertEmployee(EData employee) throws Exception {
		return false;
		
	}

	@Override
	public boolean deleteEmployee(int empId) {
		return false;
		
	}

	@Override
	public boolean updateEmployee(int empId, double newSalary) {

		return false;
	}

	@Override
	public EData getEmployee(int empId) {


		return null;
	}

	@Override
	public List<EData> getAllEmployee() {

		List<EData> emps = new ArrayList<EData>();
		String sql  = "select emp_id, emp_name, emp_email from employee";
		
		GetConnection gc = new GetConnection();
		
		try {
			gc.ps = GetConnection.getMysqlConnection().prepareStatement(sql);

			gc.rs = gc.ps.executeQuery();

			if (gc.rs.next()) {
				EData employee = new EData();
				employee.seteId(gc.rs.getInt("emp_id"));
				employee.seteName(gc.rs.getString("emp_name"));
				
				return emps;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

}
