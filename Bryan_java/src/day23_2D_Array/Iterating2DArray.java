package day23_2D_Array;

import java.util.Arrays;

public class Iterating2DArray {

	public static void main(String[] args) {
		
		int arr1[] = {1,2,3};
		int arr2[] = {4,5,6};
		int arr3[] = {9,8,7,0};
		
		System.out.println(arr2[1]); // 5
		System.out.println(arr3[3]);
//										0  1  2  3  4
		int arr4[][]= {arr1,arr2,arr3,{10,12,14,16,18}};
//						 0	 1	 2		3
		
//		for (int i = 0; i < arr3.length ; i++) {
//			System.out.println(i);
//			System.out.println(arr3[i]);
//		}
		
		for (int i = 0; i < arr4.length; i++) {
//			System.out.println(i);
//			System.out.println(arr4[i]);
			System.out.println(Arrays.toString(arr4[i]));
			
			for (int j = 0; j< arr4[i].length; j++) {
				System.out.println(arr4[i][j]);
			}
		}

	}

}
