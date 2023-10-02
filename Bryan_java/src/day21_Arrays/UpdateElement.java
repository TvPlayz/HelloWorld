package day21_Arrays;

public class UpdateElement {

	public static void main(String[] args) {
		
		String cars[] = {"Volvo","BMW","Ford","Mazda"};
		
		System.out.println(cars[0]); // Volvo
		
		cars[0] = "Tesla";
		
		System.out.println(cars[0]);
		
		cars[3] = "Toyota";
		cars[3] = "Honda";
		
		System.out.println(cars[3]);
		
		System.out.println(cars.length); // 4
		
		System.out.println(cars[0]);
		System.out.println(cars[1]);
		System.out.println(cars[2]);
		System.out.println(cars[3]);
		
		
//		for (int i = 0; i < 4; i++) {
////			System.out.println(i);
//			System.out.println(cars[i]); // 0 1 2 3
//		}
		
		for (int i = 0; i < cars.length; i++) {
//			System.out.println(i);
			System.out.println(cars[i]); // 0 1 2 3
		}

	}

}
