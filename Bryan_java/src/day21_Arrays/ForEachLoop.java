package day21_Arrays;

import java.util.Arrays;

public class ForEachLoop {

	public static void main(String[] args) {
		
		int nums[] = new int [5];
		System.out.println(Arrays.toString(nums));
		
		String names[] = new String[10];
		
		System.out.println(Arrays.toString(names));
		
		nums[0] = 5;
		nums[1] = 4;
		nums[2] = 3;
		nums[3] = 2;
		nums[4] = 1;
		
		System.out.println(Arrays.toString(nums));
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

		int index = 0;
		
		while (index < nums.length) {
			System.out.println(nums[index]);
			index++;
		}
		
		index = 0;
		
		do {
			System.out.println(nums[index]);
			index++;			
		}while (index< nums.length);
		
		
		// syntax of for each loop
		
//		for (dataType element : arrayName) {
//			System.out.println(element);
//		}
		
//		int nums[] = new int[5];
		
		for (int saroj : nums) {
			System.out.println(saroj);
		}
		
		
		String fruit1 = "Apple";
		String fruit2 = "Orange";
		String fruit3 = "Banana";
		String fruit4 = "Grapes";
//							8		1		2		3
		String[] fruits = {fruit1, fruit2, fruit3, fruit4};
		
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		
		
		char[] chars = {'j','a','v','a'};
		
		for (char c : chars) {
			System.out.println(c);
		}
		
		
		
	}

}
