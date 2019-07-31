package project.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "coffee")
public class Coffee {
	@Id
	private int coffeeId;
	private String coffeeName;
	private double milkPercent;
	private double coffeePercent;
	
	public Coffee() {
		
	}
	
	public int getCoffeeId() {
		return coffeeId;
	}
	public void setCoffeeId(int coffeeId) {
		this.coffeeId = coffeeId;
	}
	public String getCoffeeName() {
		return coffeeName;
	}
	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}
	public double getMilkPercent() {
		return milkPercent;
	}
	public void setMilkPercent(double milkPercent) {
		this.milkPercent = milkPercent;
	}
	public double getCoffeePercent() {
		return coffeePercent;
	}
	public void setCoffeePercent(double coffeePercent) {
		this.coffeePercent = coffeePercent;
	}
	public Coffee(int coffeeId, String coffeeName, double milkPercent, double coffeePercent) {
		super();
		this.coffeeId = coffeeId;
		this.coffeeName = coffeeName;
		this.milkPercent = milkPercent;
		this.coffeePercent = coffeePercent;
	}
}
