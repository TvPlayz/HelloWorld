package day26_mrthodReturnValue;

import java.util.Arrays;

public class Task2 {

//		Create a method that takes 2 array as parametter and return combined array.

//	arr1 = {1,2,3,4};
//	arr2 = {5,6,7,8};
//	
//	newArray = {1,2,3,4,5,6,7,8};
	public static void main(String[] args) {

		int num1[] = {2,1};
		int num2[] = {2,1,5,3,6};
		
		combine2Array(num1 , num2);
	}

	public static int[] combine2Array(int[] arr1, int[] arr2) {
		
		int arr3[] = new int[arr1.length + arr2.length];
		
		int index = 0;
		
		for (int num : arr1) {
			arr3[index] = num;
			index++;
		}
		
		for (int num : arr2) {
			arr3[index] = num;
			index++;
		}
		return arr3;
	}
	
	
}
