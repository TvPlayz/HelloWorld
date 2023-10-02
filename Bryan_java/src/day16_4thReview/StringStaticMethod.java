package day16_4thReview;

public class StringStaticMethod {

	public static void main(String[] args) {
		
		// .valueOf()
	    // convert any primitive datatype -> string type
		String intStr = String.valueOf(100);
		
		String charStr = String.valueOf('T');
		System.out.println(charStr.toLowerCase());
		String alterWay = 100 +"";
		
		String.valueOf(12546775L).replace("1", "L");
		
		// .join()
		System.out.println(String.join("^^^", "a" , "b" , "c"));
		
		//.format()
		// %s, - string
//		%S, - string to Uppercase
//		%d, - whole number, byte -> long
//		%f, - float, double
//		%b - boolean
		String myStr = "none";
		int carMakeYear = 2022;
		String formattedStr = String.format("my name is %s "+"I am %d years old"+" my fav pet is %s and %s","Leng", 30,"fish","hamster");
		String formatFraction = String.format("my 2 decimal fraction: %.2f", 234.23434);
		System.out.println(formattedStr);
		System.out.println(formatFraction);
		
		System.out.printf("%s is my string", "400");
	}

}
