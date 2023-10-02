package day34_inheritance;

public class Apple {

	public static void main(String[] args) {
		
//		Employee summer = new Employee("Summer", 20,'M',1234,"SDET",110000);
		Employee summer = new Employee();
		summer.age = 20;
		summer.name = "Summer";
		summer.gender = 'M';
		summer.employeeId = 1234;
		summer.jobTitle = "Test Automation Engineer";
		summer.salary = 110000;
		
		System.out.println(summer);

		summer.eat();
		summer.sleep();
		summer.run();
		
		summer.test();
		
		System.out.println(summer.toString());
		
		Tester bryan = new Tester("Bryan",20,'M', 23456,"QA Engineer", 95000);
		
		System.out.println(bryan.toString());
		
		bryan.work(); // from employee class
		
		bryan.createTestCase("T8956"); // from tester class
		
		bryan.smokeTest(); // from tester class
		
		bryan.sleep(); //  from person class
	}

}
