package com.mukunth.model;

public class Employee {
	
	private int id;
	private String name;
	private String department;
	private int companyId;
	
	public Employee(int id, String name, String department, int companyId) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.companyId = companyId;
	}
	
	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public Employee() {
		super();
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", department="
				+ department + "]";
	}
	
	
}
