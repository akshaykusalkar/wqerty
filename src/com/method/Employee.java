package com.method;

public class Employee {
	private int id;
	private String name;
	private double salary;
	public Employee() {
		name="Mia";
		salary=15000;
		id=2;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
