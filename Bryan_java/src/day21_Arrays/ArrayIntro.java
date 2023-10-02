package day21_Arrays;

public class ArrayIntro {

	public static void main(String[] args) {
		
//		Java provides a data structure, the array,
//		which stores a fixed-size sequential collection of elements of the same type.
//		An array is used to store a collection of data, but it is often
//		more useful to think of an array as a collection of variables of the same type
		
		String fruit1 = "Apple";
		String fruit2 = "Orange";
		String fruit3 = "Banana";
		String fruit4 = "Grapes";
//							8		1		2		3
		String[] fruits = {fruit1, fruit2, fruit3, fruit4};
		
		System.out.println(fruits); // memory location
		
		System.out.println(fruits.length); // returns size of the array.
		
		System.out.println(fruits[0]);
		System.out.println(fruits[1]);
		System.out.println(fruits[2]);
		System.out.println(fruits[3]);
		
//		System.out.println(fruits[4]);
		System.out.println(fruits[4-1]);
		System.out.println(fruits[fruits.length-1]);
		
		
		
		int[] numbers = {1, 2, 3, 4, 5};
		
		System.out.println(numbers[2]);
		
		double prices[] = new double[5];
		
		System.out.println(prices.length);
		
		prices[0] = 1.99;
		prices[1] = 9.9;
		prices[2] = 12.45;
		prices[3] = 7.9;
		prices[4] = 6.78;
//		prices[5] = 10.99;
		
		System.out.println(prices[2]);
		
		
		char[] chars = {'j','a','v','a'};
		
		System.out.println(chars.length); // 4
		
		

	}

}
