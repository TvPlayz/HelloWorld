package day30_constructor;

public class ObjDog {

	public static void main(String[] args) {

		Dog dog1 = new Dog();
		System.out.println(dog1.getInfo());
		
		int[] nums = new int[5];
		
		String names[] = new String[10];
		
		Dog dogs[] = new Dog[10];
		
		Dog dog2 = new Dog();
		
		System.out.println(dog2.getInfo());
		System.out.println(dog2.getInfo());
		
		dog2.breed = "Bulldog";
		dog2.age = 6;
		dog2.color = "Caramel Brown";
		dog2.size = 'M';
		System.out.println(dog2.getInfo());
		
		Dog baylee = new Dog();
		baylee.age = 6;
		baylee.size = 'L';
		baylee.color = "Multicolored";
		baylee.breed = "Husky";
		
		Dog dog3 = new Dog();
		
		dog3.breed = "Yorkshire Terrier";
		dog3.age = 11;
		dog3.size = 'S';
		dog3.color = "BlackBrown";
		
		Dog dog4 = new Dog();
		
		dog4.breed = "Dachshund";
		dog4.age = 3;
		dog4.size = 'M';
		dog4.color = "Brown";
		
		Dog dog5 = new Dog();
		
		dog5.breed = "Bischon Frise";
		dog5.age = 3;
		dog5.size = 'S';
		dog5.color = "White";
		
		Dog dog6 = new Dog();
		
		dog6.breed = "Pomeranian";
		dog6.age = 4;
		dog6.size = 'S';
		dog6.color = "Brown";
		
		Dog dog7 = new Dog();
		
		dog7.breed = "Border Collie";
		dog7.age = 9;
		dog7.size = 'L';
		dog7.color = "BrownWhite";
		
		Dog dog8 = new Dog();
		
		dog8.breed = "Dachshund";
		dog8.age = 3;
		dog8.size = 'M';
		dog8.color = "Brown";
		
		Dog dog9 = new Dog();
		dog9.breed = "Dachshund";
		dog9.age = 3;
		dog9.size = 'M';
		dog9.color = "Brown";
		
		dogs[1] = baylee;
		dogs[2] = dog2;
		dogs[3] = dog3;
		dogs[4] = dog4;
		dogs[5] = dog5;
		dogs[6] = dog6;
		dogs[7] = dog7;
		dogs[8] = dog8;
		dogs[9] = dog9;
		
		for (int i = 0; i < dogs.length; i++) {
//			System.out.println(dogs[i].getInfo());
//			System.out.println(dogs[i].breed);
			System.out.println(dogs[i].size);
		}
	}

}
