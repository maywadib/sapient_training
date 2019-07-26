package project.connections;

import java.sql.*; 

public class GetConnection {
	static Connection connection;
	public ResultSet rs1, rs2, rs3;
	public PreparedStatement ps1,ps2,ps3;
	
	public static Connection getMySqlConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/projectscm","root","mysql");
			return connection;
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
}
