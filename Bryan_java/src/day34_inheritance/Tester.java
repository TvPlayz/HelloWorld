package day34_inheritance;

public class Tester extends Employee{

	
	public Tester(String name, int age, char gender,long employeeId, String jobTitle, double salary) {
		super(name, age, gender, employeeId, jobTitle, salary);
	}
	
	public void smokeTest() {
		System.out.println(name +" is testing major fucrionality of the application.");
	}
	
	public void createTestCase(String storyNumber) {
		System.out.println(name+ " is creating test case for story #"+ storyNumber);
	}
	
	public void doesHeSmoke() {
		System.out.println();
	}
	
}
