package project.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@Column(name = "empId")
	private String empId;
	@Column(name = "empPswd")
	private String empPswd;
	public Employee() {
		
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getempPswd() {
		return empPswd;
	}
	public void setEmpPswd(String empName) {
		this.empPswd = empName;
	}
	public Employee(String empId, String empPswd) {
		super();
		this.empId = empId;
		this.empPswd = empPswd;
	}
}
