package day35_polymorphism;

import java.util.ArrayList;
import java.util.Arrays;

public class AnimalTest {
	public static void main(String[] args) {
		
		Horse h = new Horse();
		
		Dog d = new Dog();
		
		Cat c = new Cat();
		
		h.eat();
		h.makeSound();
		h.walk();
		
		d.eat();
		d.makeSound();
		d.walk();
		
		c.eat();
		c.makeSound();
		c.walk();
		
		Animal dog1 = new Dog();
		
		dog1.eat();
		dog1.walk();
		dog1.makeSound();
//		dog1.sleep();
		
		ArrayList<Animal> list = new ArrayList<>();
		
		list.add(dog1);
		list.add(c);
		list.addAll(Arrays.asList(h, d,d, new Cat(), new Horse(), new Dog()));
		
		System.out.println(list.size());
		
		for (int i = 0 ; i < list.size(); i++) {
			System.out.println("Animal #"+i+"------------");
			list.get(i).eat();
			list.get(i).walk();
			list.get(i).makeSound();
		}
		
		
		

	}

}
