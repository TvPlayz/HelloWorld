package day33_encapsulation;

public class PersonTest {

	public static void main(String[] args) {
		
		Person bryan = new Person();
		bryan.setName("Bryan");
		bryan.setAge(19);
		bryan.setAdress("208 n Lincoln av");
		
//		System.out.println(bryan.getInfo());
		
		Person adam = new Person("Adam",20, "123 rue st martin");
		
//		System.out.println(adam);
		

	}

}
