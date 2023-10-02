package day30_constructor;

public class Dog {
	String breed;
	char size;
	int age;
	String color;
	
	public void eat() {
		System.out.println(breed +" is eating your HomeWork");
	}
	
	public void sleep() {
		System.out.println(breed +" is sleeping on your bed");
	}
	
	public void sit() {
		System.out.println(breed + " is sitting on the couch");
	}
	
	public void run() {
		System.out.println(breed +" is running away from home");
	}
	
	public String getInfo() {
		String msg = "Dog class "+" Breed : "+ breed+ " , size : "+ size+ " , age : "+ age +" , color : "+ color;
			return msg;
	}
	public Dog() {
//		System.out.println("no argument constructor of Dog class");
		breed = "pitbull";
		size = 'M';
		age = 3;
		color = "White and Brown";
	}
	
}
