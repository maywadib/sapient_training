package project.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "coffeeconsumption")
public class Logs {
	@Id
	private String empId;
	private int coffeeId;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public int getCoffeeId() {
		return coffeeId;
	}
	public void setCoffeeId(int coffeeId) {
		this.coffeeId = coffeeId;
	}
	@Override
	public String toString() {
		return "Logs [empId=" + empId + ", coffeeId=" + coffeeId + "]";
	}
	public Logs(String empId, int coffeeId) {
		this.empId = empId;
		this.coffeeId = coffeeId;
	}
	public Logs() {
	// TODO Auto-generated constructor stub
}
}
