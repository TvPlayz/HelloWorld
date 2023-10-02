package day34_inheritance;

public class Employee extends Person{
		
		// instance variables
		long employeeId;
		String jobTitle;
		double salary;	
		public Employee() {}
		public Employee(String name, int age, char gender,long employeeId, String jobTitle, double salary) {
			// super is the Person class
			// this keyword is the Employee class
			super(name, age , gender); // Person class, parameterized constructor
			this.employeeId = employeeId;
			this.jobTitle = jobTitle;
			this.salary = salary;
		}



		public void test() {
//			super is the person class
			super.run(); // calling run method from person class
			System.out.println(super.gender); // reading gender from person class
			System.out.println(super.toString());
		}



		@Override
		public String toString() {
			return "Employee [employeeId=" + employeeId + ", jobTitle=" + jobTitle + ", salary=" + salary + "]"+super.toString();
		}
		
		public void work() {
			System.out.println(name + " is working");
		}

	

}
