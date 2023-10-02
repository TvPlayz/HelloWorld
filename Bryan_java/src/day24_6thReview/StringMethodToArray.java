package day24_6thReview;

import java.util.Arrays;

public class StringMethodToArray {

	public static void main(String[] args) {
		
		// .toCharArray()
	    char[] charArray = "hello world".toCharArray();
	    System.out.println(Arrays.toString(charArray));

	    // .split()
	    String price = "$ 10.95";
	    String sentence = "Click the little Reader View icon in Firefox’s address bar, and boom. No more ads, buttons, " +
	        "background colors or videos on whatever webpage you’re viewing.";
	    String[] myArr = price.split(" ");
	    System.out.println(Arrays.toString(myArr));

	    String priceStr = price.split(" ")[1];
	    System.out.println(priceStr);

	    // String.join()
	    String[] words = sentence.split(" ");
	    System.out.println(String.join("-", new String[]{"1", "2", "3"}));

	}

}
