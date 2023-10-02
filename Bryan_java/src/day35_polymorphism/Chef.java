package day35_polymorphism;

public class Chef extends Employee{

	public Chef(String name, String ssn, int age, String phoneNumber, String employeeID, String jobTitle, double salary,
			double hourlyRate, boolean isFullTime) {
		super(name, ssn, age, phoneNumber, employeeID, jobTitle, salary, hourlyRate, isFullTime);
	}
	
	public void work() {
		System.out.println(getName() + " is cooking food.");
	}

}
