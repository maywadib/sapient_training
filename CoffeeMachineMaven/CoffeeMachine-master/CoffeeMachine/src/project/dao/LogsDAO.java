package project.dao;

import java.sql.SQLException;

import project.connections.GetConnection;
import project.standards.IlogsDAO;

public class LogsDAO implements IlogsDAO{

	@Override
	public boolean insertLog(String empId, int coffeeId) {
		String sql = "insert into coffeeConsumption values (?,?)";
		GetConnection gc = new GetConnection();
 
		try {
			gc.ps1 = GetConnection.getMySqlConnection().prepareStatement(sql);
			gc.ps1.setString(1,empId);
			gc.ps1.setInt(2,coffeeId);
			return gc.ps1.executeUpdate()>0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
