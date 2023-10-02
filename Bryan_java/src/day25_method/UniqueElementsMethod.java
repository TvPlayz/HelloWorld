package day25_method;

import java.util.Arrays;

public class UniqueElementsMethod {
	public static void main(String[] args) {
		
		int arr[] = {1,2,1,1,2,3,1,5};
		
		String output = "";
		
		for (int num : arr) {
			if (!output.contains(num+"")) {
				output += num+" ";
			}
		}
		
		System.out.println(output);
		
		output = output.trim();
		
		String[] arr2 = output.split(" ");
		
		System.out.println(Arrays.toString(arr2));
	}
	
	
}
