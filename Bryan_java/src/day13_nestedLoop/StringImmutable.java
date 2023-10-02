package day13_nestedLoop;

public class StringImmutable {

	public static void main(String[] args) {
		
		String str = "Hello";
		
		String str2 = " techcircle";
		String str3 = str+str2;
		String str4 = "Hello techcircle";
		
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println(str3 == str4);
		
		
		System.out.println(str.toUpperCase());
		System.out.println(str);
		
		System.out.println(str2.toUpperCase());
		System.out.println(str2);
		
		str2 = str2.toUpperCase();
		System.out.println(str2);
		

	}

}
