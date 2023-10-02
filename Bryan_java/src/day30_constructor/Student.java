package day30_constructor;

public class Student {

	// instance variables
	String name;
	int age;
	char gender;
	long studentId;
	
	public Student() {}
	
	// instance method
	public void study(String name1) {
		name = name1;
	}
	
	public void Student1(String name1, int age1) {
		name = name1;
		age = age1;
	}
	
	// no argument constructor
	public Student(String name1 , int age1, char gender1, long studentId1) {
		System.out.println("no argument constructor of student class");
		name = "April";
		age = 20;
		gender = 'F';
		studentId = 12345;
	}
	
	public String getInfo() {
		String msg ="Student class "+", name : "+name+", age : "+age+", gender : "+gender+", studentId : "+studentId;
		return msg;
	}
}
