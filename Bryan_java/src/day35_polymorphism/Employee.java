package day35_polymorphism;

public class Employee extends Person{

	// instance variables
	String employeeID;
	String jobTitle;
	double salary;
	double hourlyRate;
	boolean isFullTime;
	
	public Employee(String name, String ssn, int age, String phoneNumber, String employeeID, String jobTitle, double salary, double hourlyRate, boolean isFullTime) {
		super(name, ssn, age, phoneNumber);
		this.employeeID = employeeID;
		this.jobTitle = jobTitle;
		this.salary = salary;
		this.hourlyRate = hourlyRate;
		this.isFullTime = isFullTime;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", jobTitle=" + jobTitle + ", salary=" + salary + ", hourlyRate="
				+ hourlyRate + ", isFullTime=" + isFullTime + "]";
	}
	
	public void work() {
		System.out.println(getName() + " is working");
	}
	

}
