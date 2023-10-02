package day24_6thReview;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// Array is type of data structure
	    // store multiple data for the same type
	    // array is fixed size.

		
//		initialize array
//		primitive array
		int[] arr = {0,1,2,3,4};
		int[] arr2 = new int[] {0,1,2,3,4};
		
//		declare array
		String[] myArr= new String[5];
//		bellow are default value of each dataType
//		-string - null
//		int - 0
//		double - 0.0
//		boolean - false
//		char - ASCII number 0
		
//		access / read array
//		0 index base
		System.out.println(arr2[0]); // first number of array
		System.out.println(arr2.length); // size or length of arr
		System.out.println(arr2.length-1); // last index of arr
		
//		reassign array
		arr2[1] = 100;
		arr2[4] = 40;
		
//		print array to console
		System.out.println(/* cannot print array */);
		String arrString = Arrays.toString(arr2);
		System.out.println(arrString);
		
//		use loop to access all array members
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("array index "+ i + " = " + arr2[i]); // array index
			System.out.println(arr2[i]);
		}
		
//		for each loop
		for (int x: arr2)
			System.out.print(x + ", ");
		
//		can only go forward
//		cannot access index
	}

}
