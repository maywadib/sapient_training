package project.dao;

import java.sql.SQLException;

import project.beans.Coffee;

import project.connections.GetConnection;
import project.standards.ICoffeeDAO;

public class CoffeeDAO implements ICoffeeDAO {

	@Override
	public boolean insertCoffee(Coffee coffee) {
		String sql = "insert into coffee values (?,?,?,?)";
		GetConnection gc = new GetConnection();

		try {
			gc.ps1 = GetConnection.getMySqlConnection().prepareStatement(sql);
			gc.ps1.setInt(1, coffee.getCoffeeId());
			gc.ps1.setString(2, coffee.getCoffeeName());
			gc.ps1.setDouble(3, coffee.getMilkPercent());
			gc.ps1.setDouble(4, coffee.getCoffeePercent());
			return gc.ps1.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

	@Override
	public Coffee getCoffeeType(int coffeeId) {

		String sql = "select coffeeId, coffeeName, milkPercent, coffeePercent from coffee where coffeeId=?";
		GetConnection gc = new GetConnection();

		try {
			gc.ps1 = GetConnection.getMySqlConnection().prepareStatement(sql);
			gc.ps1.setInt(1, coffeeId);
			gc.rs1 = gc.ps1.executeQuery();

			if (gc.rs1.next()) {
				Coffee c = new Coffee();
				c.setCoffeeId(gc.rs1.getInt("coffeeId"));
				c.setCoffeeName(gc.rs1.getString("coffeeName"));
				c.setMilkPercent(gc.rs1.getDouble("milkPercent"));
				c.setCoffeePercent(gc.rs1.getDouble("coffeePercent"));
				return c;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public Coffee getPopularCoffee() {

		String sql = "select coffeeId from coffeeconsumption group by coffeeId order by count(empId) desc limit 1";

		GetConnection gc = new GetConnection();

		try {
			gc.ps1 = GetConnection.getMySqlConnection().prepareStatement(sql);

			gc.rs1 = gc.ps1.executeQuery();

			if (gc.rs1.next()) {
				int coffeeId = gc.rs1.getInt(1);

				return new CoffeeDAO().getCoffeeType(coffeeId);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;

	}

	@Override
	public Coffee getFavoriteCoffee(String employeeId) {
		int favoriteCoffeeId = 0;
		String sql = "select coffeeId from coffeeconsumption where empId = ? group by coffeeId order by count(coffeeId) desc limit 1"; // re-factor this
		GetConnection gc = new GetConnection();
		Coffee favoriteCoffee = null;

		try {
			gc.ps1 = GetConnection.getMySqlConnection().prepareStatement(sql);
			gc.ps1.setString(1, employeeId);
			
			gc.rs1 = gc.ps1.executeQuery();
			
			if (gc.rs1.next()) {
				int coffeeId = gc.rs1.getInt(1);

				return new CoffeeDAO().getCoffeeType(coffeeId);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return null;
	}

}
