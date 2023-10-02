package day35_polymorphism;

public class Person {
	
	
	// instance variables
	private String name;
	private String ssn;
	private int age;
	private String phoneNumber;
	public Person(String name, String ssn, int age, String phoneNumber) {
		this.name = name;
		this.ssn = ssn;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", ssn=" + ssn + ", age=" + age + ", phoneNumber=" + phoneNumber + "]";
	}
	
	

}
