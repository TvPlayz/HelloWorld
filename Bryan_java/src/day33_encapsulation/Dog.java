package day33_encapsulation;

public class Dog {
	
	private String breed;
	private String size;
	private int age;
	private String color;
	
	public String getBreed() {
		return breed;
	}
	
	public void setBreed(String breed1) {
		breed = breed1;
	}
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size1) {
		size = size1;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age1) {
		age = age1;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color1) {
		color = color1;
	}

	public String getInfo() {
		return "Dog [breed=" + breed + ", size=" + size + ", age=" + age + ", color=" + color + "]";
	}
	
	
	
	

}
