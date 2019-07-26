package project.beans;

public class Employee {
	private String empId;
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
