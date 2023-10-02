package day38_exceptions;

public class NoErrorHandlingCode {

	public static void main(String[] args) {
		
		int a, b;
		
		a = 7;
		b = 0;
		
		if(b != 0) {
			System.out.println("Result is " +a /b);
		}else {
			System.out.println("B is Zero");
		}
		
		System.out.println("Programing reached this line!!");
		
		System.out.println("--------------------------");
		System.out.println("--------------------------");

		System.out.println("--------------------------");

		System.out.println("--------------------------");
		
		
		int[] arr= {1,2,3,4,5};
		
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);

		System.out.println(arr[6]);
		System.out.println(arr[0]);
		
		if (6 < arr.length) {
            System.out.println(arr[6]);
        }
        System.out.println(arr[0]);

		

	}

}
