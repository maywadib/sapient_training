package project.standards;

import project.beans.Coffee;

public interface ICoffeeDAO {
	public boolean insertCoffee(Coffee coffee);
	
	public Coffee getCoffeeType(int coffeeId);
	
	public Coffee getPopularCoffee();
	
	public Coffee getFavoriteCoffee(String employeeId);
}
