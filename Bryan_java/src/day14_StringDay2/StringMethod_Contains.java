package day14_StringDay2;

public class StringMethod_Contains {

	public static void main(String[] args) {
		
		String str = "TechCircle";
		
		System.out.println(str.contains("ch"));
		
		System.out.println(str.contains("c"));
		
		System.out.println(str.contains("y"));
		
		System.out.println(str.indexOf('i')); // 5
		
		System.out.println(str.contains("i")); // true
		
		if (str.indexOf('i') > -1) {
			System.out.println("String contains letter i");
		}
		
		if (str.contains("i")) {
			System.out.println("String contains letter i");
		}
		
		if (str.indexOf("t") > -1) {
			System.out.println("String contains letter i");
		} else {
			System.out.println("String do not contains letter i");
		}
		
		if (str.contains("t")) {
			System.out.println("String contains letter i");
		} else {
			System.out.println("String do not contains letter i");
		}

		if (str.contains("h")) {
			System.out.println("has h");
		}
		
		if (str.indexOf("h")>-1) {
			System.out.println("has h");
		}
	}

}
