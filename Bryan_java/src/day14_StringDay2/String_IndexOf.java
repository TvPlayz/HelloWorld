package day14_StringDay2;

public class String_IndexOf {

	public static void main(String[] args) {
//					   012345678910     17
		String name = "President George Washington";
		
		System.out.println(name.charAt(0)); // returns character at given index position
		
		System.out.println(name.indexOf('P')); // returns index position on the given character
		
		System.out.println(name.indexOf('p'));
		
		System.out.println(name.indexOf('G'));
		
		System.out.println(name.indexOf("G"));
		
		System.out.println(name.indexOf('e'));
		
		System.out.println(name.indexOf('e', 4));
		
		System.out.println(name.lastIndexOf('e'));
		
		System.out.println(name.indexOf("George"));
		
		System.out.println(name.indexOf("ash")); // 18
		
		System.out.println(name.indexOf("ashley"));

	}

}
