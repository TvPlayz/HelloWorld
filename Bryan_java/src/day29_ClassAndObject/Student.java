package day29_ClassAndObject;

public class Student {

	// instance variable
	String name;
	char gender;
	int age;
	long ID;
	int grade;
	
	public void study() {
		System.out.println(name + " is learning java");
	}
	
	public void eating() {
		System.out.println(name +" is eating dinner");
	}
	
	public void sleeping() {
		System.out.println(name + " is sleeping");
	}

	public String getInfo() {
		String msg ="Student class"+ " , Name : "+ name +" , Age : "+ age +" , ID :"+ ID +" , Gender : "+ gender + " , Grade : "+ grade;
			return msg;
	}
}
