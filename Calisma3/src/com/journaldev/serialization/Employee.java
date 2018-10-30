package com.journaldev.serialization;

public class Employee extends Employeee3 {

	private static final long serialVersionUID = 7677803733231034938L;
	private String name;
	private int id;
	transient private int salary;
	public Employee2 employee2;

	// private String password;

	@Override
	public String toString() {
		return "Employee{name=" + name + ",id=" + id + ",salary=" + salary + "}";
	}

	// getter and setter methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	// public String getPassword() {
	// return password;
	// }
	//
	// public void setPassword(String password) {
	// this.password = password;
	// }

}
