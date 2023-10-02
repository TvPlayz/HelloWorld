package day08_2ndreview;

public class AssignmentOperDemo {

	public static void main(String[] args) {

		// Assignment Operator
		// =
		
		// assign a value to variable
		
		int x = 1;
		x = x + 2;
		System.out.println("x = " + x);
		
		// Compound assignment operator
		// +=, -=, *=, /=
		
		// increment the value then assign it back to the same
		int y = 1;
		y+=3; // y = y + 2;
		System.out.println("y = " + y);
		
		// decrement
		int i = 10;
		i = i - 4; // 6
		i -= 4; // 2
		System.out.println("i = " + i);
		
		int num = 10;
		num = num + 1; // add 1 to num;
		num += 1; // add 1 to num
		num++; // add 1 to num
		System.out.println(num);
		
		
		num--; // subtract 1 from num
		num-=1;
		num = num - 1;
		
		System.out.println("===========");
		
		int a = 1;
		int b = a++; // b = 1, a = 2
		System.out.println("a : " + a); // 2
		System.out.println("b : " + b); // 1
		
		
		int aa = 1; // aa = 1
		int bb = ++aa; // aa = 2, bb = 2
		System.out.println("aa : " + aa); // 2
		System.out.println("bb : " + bb); // 2
		
		
		

	}

}
