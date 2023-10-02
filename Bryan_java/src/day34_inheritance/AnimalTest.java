package day34_inheritance;

import java.util.ArrayList;

public class AnimalTest {

	public static void main(String[] args) {
	
		Cat jim = new Cat("Jim", 2, 'M');
		Dog john = new Dog("John", 5, 'M');
		
		ArrayList<Dog> dogs = new ArrayList<>();
		
		dogs.add(john);
		
		ArrayList<Cat> cats = new ArrayList<>();
		
		cats.add(jim);
		
		ArrayList<Animal> list = new ArrayList<>();
		
		list.add(john);
		list.add(jim);
		list.addAll(cats);
		list.addAll(dogs);
		
		for (Animal a : list) {
			System.out.println(a.toString());
			a.makeSound();
		}

	}

}
