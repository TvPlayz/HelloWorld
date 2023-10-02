package day04_1streview;

public class DeclareVsInitialize {
	public static void main(String[] args) {
		//DataType varName = value;
		String schoolName = "Tech Circle";
				
		//Declare
		String myCat;
//		System.out.println(myCat); //this will not work
		//  because the variable hasn't initialize yet
		// do something
		
		
		
		
		myCat = "Sonic";
		System.out.println(myCat);
		myCat = "Lego";
		System.out.println(myCat);
		myCat = "something else";
		System.out.println(myCat);
		
		// Declare more than one,
		// but they have to be the same datatype
		
//		int a;
//		int b;
//		int c;
		int a,b,c;
		
		a = 0;
		b = 1;
		c = 2;
		
		// Constant
		// name convention
		// SCREAM SNAKE CASE
		// ONE_TWO_THREE_FOUR
		
		// store fraction, decimal
		double PI = 3.14;
		// pi * R^2
		// formular to calculate circle area
		PI = 4.56;
	}

}
