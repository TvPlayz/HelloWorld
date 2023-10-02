package day34_inheritance;

public class Person {

	// instance variable
	String name;
	int age;
	char gender;
	
	// constructor variable
	public Person() {}
	public Person(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	// instance method
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	public void sleep() {
		System.out.println(name + " is sleeping.");
	}
	
	public void eat() {
		System.out.println(name + " is eating food.");
	}
	
	public void run() {
		System.out.println(name + " can run fast");
	}
	
	
}
