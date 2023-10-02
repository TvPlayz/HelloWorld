package day21_Arrays;

import java.util.Arrays;

public class StringSplit {
	public static void main(String[] args) {
		String text = "Java is fun programing language.";
		
		System.out.println(Arrays.toString(text.split(" ")));
		
		String[] arr = text.split(" ");
		
		System.out.println(arr.length);
		
		for (int i= 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for (String word : arr) {
			System.out.println(word);
		}
		
		
		String[] arr2 = text.split("programing");
		
		System.out.println(Arrays.toString(arr2));
		
		String[] arr3 = text.split("a");
		
		System.out.println(Arrays.toString(arr3));
		
		
		String str = "BUY EURO SELL USD"; // SELL EURO BUY USD
		String[] arr4 = str.split(" ");
        System.out.println(Arrays.toString(arr4)); // [BUY, EURO, SELL, USD]
        System.out.println(arr4[2] + " "+ arr4[1]+ " " + arr4[0]+ " "  + arr4[3]);
		
		
		
		
		

	}

}
