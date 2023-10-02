package day22_ArrayDay2;

import java.util.Arrays;

public class ArrayReview {

	public static void main(String[] args) {
		
		// index start from 0
		// fixed size
		// Element of same type
		
		int[] arr = new int[10];
		
		System.out.println(arr[0]); //0
		
		System.out.println(arr.length);
		
		System.out.println(Arrays.toString(arr));
		
		arr[3] = 5;
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(arr[arr.length-1]);
		
		arr[arr.length-1] = 1000;
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(arr[arr.length-2]);
		
		arr[arr.length-2] = 900;
		
		System.out.println(arr[arr.length-2]);
		
		System.out.println(Arrays.toString(arr));
		
		
		double arr2[] = {0.99, 7.99, 14.99, 0.45, 2.99};
		Arrays.sort(arr2);
		
		System.out.println(Arrays.toString(arr2));
		
		String title = "Will Jojo’s Bizarre Adventure: Steel Ball Run be Coming to Netflix?";
		
		String arr3[] = title.split(" ");
		
		System.out.println("Word count is "+ arr3.length);
		
		for (int i =0; i< arr3.length; i++) {
//			System.out.println(i);
			
			System.out.println(arr3[i]);
			
			String word = arr3[i];
			
//			if (word.contains(",")) {
//				System.out.println(word.replace(",", ""));
//			}else {
//				System.out.println(word);
//			}
			
			if (word.indexOf(':')>-1) {
				System.out.println(word.replace(":", ""));
			}else {
				System.out.println(word);
			}
		}
		
//		syntax:
//			for (dataType element : arrayName) {
//				
//			}
		
		System.out.println("--------------------------");
		for (String str : arr3) {
			System.out.println(str);
			if (str.contains(",")) {
				System.out.println(str.replace(",", ""));
			}else {
				System.out.println(str);
			}
		}
		
	}

}
