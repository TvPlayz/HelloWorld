package day29_ClassAndObject;

public class Car {

		
		// instance variables
		
		String model;
		int year;
		String color;
		String brand;
		boolean isElectric;
		
		
		public void drive() {
			System.out.println("Driving "+ year +" "+ brand + " "+ model);
		}
		
		public void stop() {
			System.out.println(year +" "+ brand + " "+ model+ " has stopped");
		}
		
		public void start() {
			System.out.println(year +" "+ brand + " "+ model+ " has started");
		}
		
		public String getInfo() {
			String msg = "Car Class"+" , Model : "+ model + " , Brand : "+ brand +" , Color : "+ color +" , Year : "+ year + " , isElectric : "+ isElectric;
			return msg;
		}
	

}
