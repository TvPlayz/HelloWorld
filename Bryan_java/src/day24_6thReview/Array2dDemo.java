package day24_6thReview;

import java.util.Arrays;

public class Array2dDemo {

	public static void main(String[] args) {
		
		// Most of the tiime will use 2d array with table

	    // initialize array
	    int[][] arr = {
	      // 0  1  2
	        {1, 2},       // 0
	        {3, 4, 5},    // 1
	        {6, 7},       // 2
	        {10, 20, 30, 40}
	    };
	    // access array
	    System.out.println(arr[1][1]);
	    System.out.println(arr[2][0]);

	    // declare array
	    int[][] emptyArr = new int[3][2];
	    int[][] emptyArr1 = new int[3][];
//	    int[][] emptyArr2 = new int[][2]; this won't work

	    // reassign array
	    arr[1][0] = 30;

	    // print array to console
	    System.out.println(Arrays.deepToString(arr));

	    // Loop with 2d array
	    // print each 2d members in each line
	    for (int row = 0; row < arr.length; row++) {
	      for (int col = 0; col < arr[row].length; col++) {
	        System.out.println(arr[row][col]);
	      }
	    }
	    System.out.println();
	    
	    // print each ar ray in each line
	    for (int row = 0; row < arr.length; row++) {
	      System.out.println(Arrays.toString(arr[row]));
	    }

	}

}
