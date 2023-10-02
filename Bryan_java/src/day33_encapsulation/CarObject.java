package day33_encapsulation;

public class CarObject {
public static void main(String[] args) {
	
	Car car1 = new Car(); // class instantiation
	
	System.out.println(car1);
	
//	car1.color = "Red";
	car1.setColor("Red");
//	car1.make = "Honda";
	car1.setMake("Honda");
//	car1.model = "CIVIV";
	car1.setModel("Civiv");
//	car1.year = 2015;
	car1.setYear(2015);
	
	System.out.println(car1);
	
	
//	car1.color ="White";
//	car1.model = "Pilot";
//	car1.year = 2023;
	car1.setColor("White");
	car1.setModel("Pilot");
	car1.setYear(2023);
	
	System.out.println(car1);
	
	Car car2 = new Car("Toyota", "Camry" , 2018 , "Silver");
	
	System.out.println(car2);
	
	System.out.println(car2.getColor());
	System.out.println(car2.getYear());
	System.out.println(car2.getMake());
	System.out.println(car2.getModel());
	
	
	
	}
}
