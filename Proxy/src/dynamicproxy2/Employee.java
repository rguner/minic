package dynamicproxy2;

public class Employee extends Person {

	private String ssn;
	private String department;
	private float salary;

	public String getSSN() {
		return ssn;
	}

	public String getDepartment() {
		return department;
	}

	public float getSalary() {
		return salary;
	}

	public void setSSN(String ssn) {
		this.ssn = ssn;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
}
