package day23_2D_Array;

import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {
		
		String str1 ="car";
		String str2 = "arc";
		
		char[] first = str1.toCharArray();
		char[] second = str2.toCharArray();
		Arrays.sort(first);
		Arrays.sort(second);
		
		if(Arrays.equals(first, second)) {
			System.out.println(str1 + " and " + str2 + " is Anagram");
			} else{
				System.out.println(str1 + " and " + str2 + " is not Anagram");
			}
		
		
		

	}

}
