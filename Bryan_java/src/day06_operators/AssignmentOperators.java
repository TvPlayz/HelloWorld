package day06_operators;

public class AssignmentOperators {

	public static void main(String[] args) {
		
		// = , += , -= , *= , /=
		
		int a = 5;
		
		a = a + 5;
		
		System.out.println(a); // 10
		
		a += 5; // a = a + 5;
		
		System.out.println(a); // 15
		a += 5;
		a += 5;
		a += 5;
		System.out.println(a); // 30
		
		a++;
		System.out.println(a); // 31
		
		a-=2; // a = a - 2;
		System.out.println(a); // 29
		
		a-=19;
		
		System.out.println(a); // 10
		
		
		a*=10; // a = a * 10
		
		System.out.println(a); // 100
		
		a /= 10; // a = a / 10;
		
		System.out.println(a); // 10
		
		
		//
		
		
		int num = 92;
		
		int summerIsMyFirstDigit = num / 10;
		
		System.out.println(summerIsMyFirstDigit);
		
		int lastDigit = num%10;
		System.out.println(lastDigit);
		
		int num2 = 25;
//		output = 52
		
//		write a program to reverse user input using arithmetic operator
		
		int first = num2 / 10;
		
		System.out.println(first);
		
		int last = num2 % 10;
		System.out.println(last);
		
		int reverse = last*10 + first;
		
		System.out.println(reverse);
		

	}

}
