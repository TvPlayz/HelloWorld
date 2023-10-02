package day29_ClassAndObject;

public class CarMax {

	public static void main(String[] args) {
		
		Car civic = new Car();
		
		System.out.println(civic.brand);
		System.out.println(civic.color);
		System.out.println(civic.model);
		System.out.println(civic.year);
		
		civic.start();
		civic.drive();
		civic.start();
		
		civic.brand = "Honda";
		civic.color = "White";
		civic.model = "Civic";
		civic.year = 2022;
		civic.isElectric = false;
		
		civic.start();
		civic.drive();
		civic.stop();
		
		Car car2 = new Car();
		car2.brand = "Tesla";
		car2.model = "X";
		car2.color = "Red";
		car2.year = 2019;
		car2.isElectric = true;
		
		car2.start();
		car2.drive();
		car2.stop();
		
		Car myCar = new Car();
		myCar.brand = "Nissan";
		myCar.model = "Rouge";
		myCar.color = "Grey";
		myCar.year = 2010;
		myCar.isElectric = false;
		
		myCar.start();
		myCar.drive();
		myCar.stop();
		
		System.out.println(civic.getInfo());
		System.out.println(car2.getInfo());
		System.out.println(myCar.getInfo());
	}

}
