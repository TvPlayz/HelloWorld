package day05_operators;

public class ArithmeticOperator {

	public static void main(String[] args) {
		
		// + , - , * , / , % , ++ , -- ,
		// addition (+)
		int a = 10;
		int b = 5;
		int c = 3;
		
		System.out.println(a+b);
		
		int result = a+b; // 10 + 5;
		
		System.out.println(result);
		
//		int result2 = a+b+c;
		int result2 = result +c; // 15 + 3;
		
		System.out.println(result2);
		
		double d = 9.9;
		
		System.out.println(a+d); // 10 + 9.9;
		
		double result3 = a+d; // 19.9
		
		System.out.println(result3); //
		
		
		//subtraction (-) /// java -version
		
		System.out.println(a-b-c); // 2
		
		System.out.println(c-a); // -7
		
		// create 2 variables x and y, assign some value
		// and use * and division operator
		// print your result in the console window
//						   10*5	
		System.out.println(a*b); // 50
//						   10/5
		System.out.println(a/b); // 2
		
		// % (Remainder)
		
		System.out.println("--------------------Remainder--------------------");
		
		System.out.println(10.0/3.0); // 3.33_
		
		System.out.println(10%3); // 1
		
		System.out.println(10%2); // 0
		
		System.out.println(10%5); // 0
		
		System.out.println(10%4); // 2
		
		System.out.println(6%3); // 0
		System.out.println(7%2); // 1
		
		System.out.println(258%2); // 0
		System.out.println(259%2); //1

		
		// ------- increment operator ++
		
		a = 1;
		
		a = a + 1;
		
		System.out.println(a);
		
		a++; // a = a + 1;
		System.out.println(a); // 3
		a++; // +1
		a++; // +1
		a++; // +1
		
		System.out.println(a); // 6
		
		a = a - 1; // 5
		System.out.println(a);
		
		a--; // a = a - 1;
		
		a--; // 
		a--;
		a--;
		System.out.println(a); // 1
		
		
		
		int index = 0;
		
		System.out.println(index); // 0
		
		index++;
		System.out.println(index); // 1
		
		index++;
		System.out.println(index); // 2
		
		index++;
		System.out.println(index); // 3
		
		index++;
		System.out.println(index); // 4

		index++;
		System.out.println(index); // 5

		index++;
		System.out.println(index); // 6

		index++;
		System.out.println(index); // 7

		index++;
		System.out.println(index); // 8

		index++;
		System.out.println(index); // 9

		index++;
		System.out.println(index); // 10
		
		System.out.println("--------------decrement-----------");
		
		index--; // index = index -1 ;
		System.out.println(index);

		index--; // index = index -1 ;
		System.out.println(index);

		index--; // index = index -1 ;
		System.out.println(index);

		index--; // index = index -1 ;
		System.out.println(index);

		index--; // index = index -1 ;
		System.out.println(index);

		index--; // index = index -1 ;
		System.out.println(index);
		
		
		
		
		
	}

}
