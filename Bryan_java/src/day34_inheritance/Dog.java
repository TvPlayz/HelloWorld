package day34_inheritance;

public class Dog extends Animal {

	public Dog(String name, int age, char gender) {
		super(name, age, gender);
	}
	
	
	
	public void makeSound() {
		System.out.println("WOOOOOOF");
	}
}
