package day21_Arrays;

import java.util.Arrays;
import java.util.Random;

public class Task1 {

	public static void main(String[] args) {
		
		// create an array of integer and store 10 value.
		
		int nums[] = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(nums[0]);
		System.out.println(Arrays.toString(nums));
		
		
		int nums2[] = new int[10];
		
		Random random = new Random();
		
		nums2[0] = random.nextInt(50);
		nums2[1] = random.nextInt(50);
		nums2[2] = random.nextInt(50);
		nums2[3] = random.nextInt(50);
		nums2[4] = random.nextInt(50);
		nums2[5] = random.nextInt(50);
		nums2[6] = random.nextInt(50);
		nums2[7] = random.nextInt(50);
		nums2[8] = random.nextInt(50);
		nums2[9] = random.nextInt(50);
		
		System.out.println(nums2[0]);
		
		System.out.println(Arrays.toString(nums2));
		

		
		
		
		

	}

}
