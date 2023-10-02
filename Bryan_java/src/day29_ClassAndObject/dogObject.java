package day29_ClassAndObject;

public class dogObject {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Dog dog3 = new Dog();
		
		dog1.breed = "Neapolitan Mastiff";
		dog1.size = 'L';
		dog1.age = 5;
		dog1.color = "Black";
		
		dog1.eat();
		dog1.sleep();
		dog1.sit();
		dog1.run();
		System.out.println(dog1.getInfo());
		
		dog2.breed = "Maltese";
		dog2.size = 'S';
		dog2.age = 2;
		dog2.color = "White";
		
		dog2.eat();
		dog2.sleep();
		dog2.sit();
		dog2.run();
		System.out.println(dog2.getInfo());
		
		dog3.breed = "Chow Chow";
		dog3.size = 'M';
		dog3.age = 3;
		dog3.color = "Brown";
		
		dog3.eat();
		dog3.sleep();
		dog3.sit();
		dog3.run();
		System.out.println(dog3.getInfo());
	}

}
