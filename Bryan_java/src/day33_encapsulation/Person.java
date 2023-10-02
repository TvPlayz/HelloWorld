package day33_encapsulation;

public class Person {
    /*
    1, Create a class called Person with the following attributes:
    
    name (String)
    age (int)
    address (String)
    
    1.5, Implement encapsulation by making the name, age, and address attributes private.
    
    2, Create public getter and setter methods for each attribute.
    
    3, Implement validation in the setter methods to ensure that the age attribute 
       is between 0 and 120, and that the name and address attributes are not empty.
    
    4, Create a constructor for the Person class that accepts values for the name, 
       age, and address attributes and initializes them using the setter methods.
    
*/
	private String name;
	private int age;
	private String address;
	
	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name1) {
		if(name.length() != 0) {
		name = name1;
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age1) {
		if (age >= 0 && age <= 120) {
		age = age1;
		}
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAdress(String address1) {
		address = address1;
	}


	public String getInfo() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	public Person() {
		
	}
	
	
	
}
