package dynamicproxy2;

public interface IEmployee extends IPerson {

	public String getSSN();

	public String getDepartment();

	public Float getSalary();

	public void setSSN(String ssn);

	public void setDepartment(String department);

	public void setSalary(String salary);
}
