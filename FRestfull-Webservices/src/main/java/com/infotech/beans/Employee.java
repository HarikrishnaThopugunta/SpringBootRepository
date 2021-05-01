package com.infotech.beans;

public class Employee {
	
	private String empName;
	private Integer empId;
	private String empAddress;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	
	public Employee(String empName, Integer empId, String empAddress) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAddress = empAddress;
	}
	

}
