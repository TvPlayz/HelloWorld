package day16_4thReview;

public class StringReview {

	public static void main(String[] args) {
		
		// String
		// ""
		
		// non-primitive
		String myStr2 = new String("this is redundant way");
		
		// + , concat
//		System.out.println(myStr + " !!!");
		
		//              0123456789
		//						  0   // max index = 10
		String myStr = "hello world"; // literal string
		
		//class string
		// util method, string method
		// string_var.toUpperCase();
		
		// toUppercase() / toLowerCase()
		// length() -> return number of char in str (include empty char)
		System.out.println(myStr.length()); // 11
		
		// charAt();
		System.out.println(myStr.charAt(0)); // first letter
		System.out.println(myStr.charAt(myStr.length()-1)); // last letter
		
		// indexOf();
		System.out.println(myStr.indexOf('o')); // 4
		// to start search from provide index
		System.out.println(myStr.indexOf("o", 5)); // 7
		System.out.println(myStr.indexOf("world")); // 6
		System.out.println(myStr.indexOf("x")); // -1
		
		//startsWith() / endsWith() -> boolean
		System.out.println(myStr.startsWith("hell"));
		System.out.println(myStr.endsWith("hell"));
		//isBlank() / isEmpty() = .length() == 0
		System.out.println(" \n/t\r   ".isBlank());
		System.out.println(" \n/t\r   ".isEmpty());
		
		// cpntains() -> check if that string contains target str
		System.out.println(myStr.contains("346lwergosgr"));
		
		// replace
		System.out.println(myStr.replace("l", "!"));
		System.out.println(myStr.replace("o", "")); // remove 'o'
		System.out.println(myStr.replaceFirst("o", ""));
		
		// substring()
		// to get partial word of the string
		System.out.println(myStr.substring(0,myStr.indexOf(" ")));
		System.out.println(myStr.substring(myStr.indexOf(" ")+ 1));
		
//		System.out.println(myStr.);

	}

}
