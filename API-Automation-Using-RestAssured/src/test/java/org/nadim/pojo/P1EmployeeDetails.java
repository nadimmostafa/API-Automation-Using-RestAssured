package org.nadim.pojo;

/**
 * 
 */
public class P1EmployeeDetails {
	private int empId;
	private String empName;
	private String empGender;
	private String email;
	private double salary;
	private P2EmployeeAddress adress;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpGender() {
		return empGender;
	}
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public P2EmployeeAddress getAdress() {
		return adress;
	}
	public void setAdress(P2EmployeeAddress adress) {
		this.adress = adress;
	}
	
}
