package day21_Arrays;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		char[] chars = {'j','a','v','a'};
		
		System.out.println(Arrays.toString(chars));
		
		Arrays.sort(chars);
		
		System.out.println(Arrays.toString(chars));
		
		
		String fruit1 = "Apple";
		String fruit2 = "Orange";
		String fruit3 = "Banana";
		String fruit4 = "Grapes";
//							8		1		2		3
		String[] fruits = {fruit1, fruit2, fruit3, fruit4};
		
		System.out.println(Arrays.toString(fruits));
		
		Arrays.sort(fruits);
		
		System.out.println(Arrays.toString(fruits));

	}

}
