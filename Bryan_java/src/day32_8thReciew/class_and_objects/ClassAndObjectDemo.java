package day32_8thReciew.class_and_objects;

public class ClassAndObjectDemo {

	public class Player {
		String name;
		int health;
	}
	
	public Player() {
		
	}
	
	public Player(String name, int health) {
		this.name = name;
		this.health = health;
	}
	
	void walk() {
		System.out.println("this player is walking");
	}
}
