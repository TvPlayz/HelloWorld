package day04_1streview;

public class DataType {
	public static void main(String[] args) {
		// DataType varName = value;
		//    ^
		// There 2 main type of data
		// Primitive
		
		//
		// whole number - byte, short, int, long
		//
		// decimal number -  double, float
		// single character - char
		// boolean (true/false) - boolean
		
		// Primitive
		byte monthOfYear = 12;
		short dayInYear = 365;
		int housePrice = 450_000;
		long viewCount = 4_000_000_000_000L;
		
		float milkPrice = 2.95f;
		double myBalance = 238368.349437;
		System.out.println(milkPrice);
		System.out.println(myBalance);
		
		char letter = 'A';
		boolean isOn = true;
		
		// Non-Primitive / Reference Type
		String myDog = new String("Bebe");
//		Random random = new Random();
//		Scanner sc = new Scanner();
//		ArayList<String> list = new ArayList<>();
	}
}
