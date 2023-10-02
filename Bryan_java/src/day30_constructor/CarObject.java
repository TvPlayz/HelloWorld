package day30_constructor;

public class CarObject {

	public static void main(String[] args) {
//		String model1 , int year1, String color1, String beand1, boolean isElectric
		 	Car car1 = new Car("Toyota" , 2018 , "Silver" , "Highlander" , false);
	        Car car2 = new Car("Honda" , 2020 , "White" , "Accord" , true);
	        Car car3 = new Car("Lexus" ,2011 , "Black" , "GX" , false );
	        Car car4 = new Car("Tesla" ,2020 , "White" , "X" , true );
	        Car car5 = new Car("Huyndai" ,2027 , "White" , "Elantra" , false );
	        Car car6 = new Car("Ford" ,2017 , "Black" , "F150" , false );
	        Car car7 = new Car("Ford" ,2017 , "Silver" , "Escape" , false );
	        Car car8 = new Car("Toyota" , 2023 , "Black" , "Corrolla" , true );
	        Car car9 = new Car("Honda" ,2023 , "Blue" , "Pilot" , false );
	        Car car10 = new Car("Toyota" ,2023 , "Black" , "Sienna" , true );

	        Car[] cars = {car1,car2,car3,car4,car5,car6,car7,car8,car9,car10};
	        
	        for(Car  c : cars) {
//	        	System.out.println(c.getInfo());
//	        	System.out.println(c.brand);
	        	if (c.brand.equalsIgnoreCase("Toyota")) {
	        		System.out.println(c.getInfo());
	        	}
	        }
	}

}
