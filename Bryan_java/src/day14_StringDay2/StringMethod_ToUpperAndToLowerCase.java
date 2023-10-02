package day14_StringDay2;

public class StringMethod_ToUpperAndToLowerCase {

	public static void main(String[] args) {
		
		String str = "techCIRcle";
		
		System.out.println(str);
		
		System.out.println(str.toUpperCase()); // TECHCIRCLE
		
		System.out.println(str.toLowerCase()); // trchcircle
		
		System.out.println(str); // techCIRcle
		
		String str2 = str.toUpperCase();
		
		System.out.println(str2); // TECHCIRCLE
		
		System.out.println(str);

	}

}
