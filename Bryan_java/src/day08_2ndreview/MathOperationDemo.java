package day08_2ndreview;

public class MathOperationDemo {
	public static void main(String[] args) {

		// +, -. *, /

		// division - /
		double x = 6;
		double y = 2;

		// 5 / 2 = 2.5

		double result = x / y;
		System.out.println(result);

		// % - modular - find the remainder from division
		result = x % y;
		// 5 / 2 = 2 1 remain
		System.out.println(result);
		
		System.out.println(10 % 5); // 0
		System.out.println(90 % 78); // 12
		System.out.println(12 % 5); // 2
		
		// 2henever you modular the number by 10th (10 , 100, 1000, ....)
		// the result will be
		// the last digit, second to last, third to last...
		System.out.println(503435446 % 10); // 6
		System.out.println(38905643 % 10); // 2
		System.out.println("=========");
		System.out.println(35239 % 100);
		System.out.println(23456634 % 1000);
		
		// first number is smaller than second
		System.out.println("first number is smaller than second");
		System.out.println(3 % 10);
		System.out.println(12 % 25);
		System.out.println(434 % 2346234);

		
	}

}
