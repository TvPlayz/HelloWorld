package day27_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {

	public static void main(String[] args) {
		
//		Write a program to convert array to arrayList
		
		 int[] nums = { 2, 1, 4, 6 };

	        ArrayList<Integer> num = new ArrayList<Integer>();

	        for (int n : nums) {
	            num.add(n);

	       }
	        System.out.println(num);
	}

}
