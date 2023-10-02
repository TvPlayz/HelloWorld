package day34_inheritance;

public class Animal {

	private String name;
	private int age;
	private char gender;
	
	public Animal() {}
	
	public Animal(String name, int age, char gender) {
		setName(name); // this.name = name;
		setAge(age);
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void move() {
		System.out.println("Animal is moving");
	}
	
	public void makeSound () {
		System.out.println(name+ " is making sound");
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
	
	
	
	
}
