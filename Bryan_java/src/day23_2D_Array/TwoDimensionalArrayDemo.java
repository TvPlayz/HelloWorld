package day23_2D_Array;

import java.util.Arrays;

public class TwoDimensionalArrayDemo {

	public static void main(String[] args) {
		
		int arr1[] = {1,2,3};
		int arr2[] = {4,5,6};
		int arr3[] = {9,8,7,0};
		
		System.out.println(arr2[1]); // 5
		System.out.println(arr3[3]);
//										0  1  2  3  4
		int arr4[][]= {arr1,arr2,arr3,{10,12,14,16,18}};
//						 0	 1	 2		3
		
		System.out.println(arr4[1][1]);
		
		System.out.println(arr4[2][2]);
		
		System.out.println(arr4[0][1]);
		
		System.out.println(arr4[3][0]);
		
		System.out.println(arr4[3][4]);
		
		System.out.println(arr4.length);
		
		int numbers[] = new int [10];
		
		int arr5[][] = new int [5][];
		
		System.out.println(Arrays.toString(arr4[3]));
		int [] arr6 = {11, 33, 222, 555};
		
		arr5[0] = arr4[3];
		arr5[1] = arr1;
		arr5[2] = arr2;
		arr5[3] = arr6;
		arr5[4] = arr3;
		
		System.out.println(Arrays.toString(arr5[0]));
		System.out.println(Arrays.toString(arr5[1]));
		System.out.println(Arrays.toString(arr5[2]));
		System.out.println(Arrays.toString(arr5[3]));
		System.out.println(Arrays.toString(arr5[4]));
		
//		System.out.println(Arrays.toString(arr5);
		
		
		

	}

}
