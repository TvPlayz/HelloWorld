package day25_method;

import java.util.Arrays;

public class MethodTest {

	public static void main(String[] args) {
//		Scanner scan = new Scanner();
//		Random random = new Random();
		MethodDemo md = new MethodDemo(); // Creating instance of MethodDemo Class
		md.sayHello();
		
		System.out.println("----------------------");
		md.sayHello10Times();
		
		md.addition(3 , 7);
		
		md.addition(23, 27);
		
		int num = 5;
		
		md.printMultiplicationTable(8);
		
		md.printMultiplicationTable(4);
		
		int[] arr = {3,33,11,89,34,900,};
//		
//		Arrays.sort(arr);
//		
//		System.out.println(Arrays.toString(arr));
//		
//		System.out.println(arr[4]);
//		
//		System.out.println(arr[arr.length-1]);
		
		md.printMaxValueFromAnIntegerArray(arr);
		
		
	}

}
