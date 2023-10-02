package day15_StringTasks;

public class ReverseString {

	public static void main(String[] args) {
//		              012
		String str = "xyz";
		String reverse = "";
		
//		for (int i = 2; i >= 0; i--) {
//			System.out.println(i);
//		}
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(2));
		
		System.out.println(str.length()-1);
		
		for (int i = str.length()-1; i >= 0; i--) {
//			System.out.println(i);
//			System.out.println(str.charAt(i));
			reverse += str.charAt(i);
		}
		
		System.out.println(reverse);
		
//		System.out.println(str.charAt(2)); // c
//		System.out.println(str.charAt(1)); // b
//		System.out.println(str.charAt(0)); // a
		
	
		

	}

}
