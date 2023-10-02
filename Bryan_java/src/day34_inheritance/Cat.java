package day34_inheritance;

public class Cat extends Animal{
//	Implicit super constructor Animal() is undefined for default constructor. Must define an explicit constructor
	public Cat(String name, int age, char gender) {
		super(name, age, gender); // calling Animal class parameterized constructor
//		super(); no argument constructor
	}
	
	public void makeSound() {
		System.out.println("MEEOOOW!!");
	}
}
