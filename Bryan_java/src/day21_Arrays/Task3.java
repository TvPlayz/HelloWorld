package day21_Arrays;

public class Task3 {

	public static void main(String[] args) {
		
		// find the sum and average of elements in an integer array
		
		int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		double sum = 0;
		double avg = 0;
		
		for (int num : nums) {
            sum += num;
            avg++;
        }
        double avg2 = sum / avg;
        System.out.println("Sum of number in array is " + sum);
        System.out.println("Average of number in array is " + avg2);
		
		

	}

}
