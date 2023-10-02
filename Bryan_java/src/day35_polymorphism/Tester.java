package day35_polymorphism;

public class Tester extends Employee{

	public Tester(String name, String ssn, int age, String phoneNumber, String employeeID, String jobTitle,
			double salary, double hourlyRate, boolean isFullTime) {
		super(name, ssn, age, phoneNumber, employeeID, jobTitle, salary, hourlyRate, isFullTime);
	}
	
	public void work() {
		System.out.println("Creating test cases");
		System.out.println(getName() + " is writing test script for login functiion");
	}
	
	public void regressionTest() {
		System.out.println(getName()+ " is doing release testing");
	}

}
