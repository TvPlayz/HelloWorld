package day35_polymorphism;

public class CalculatorTest {

	public static void main(String[] args) {
		
		MethodOverLoading m = new MethodOverLoading();
		
		int result = m.addition(1, 2);
		
		double result1 = m.addition(1.5, 2);
		
		int result2 = m.addition(1, 2, 4);
		
		double result3 = m.addition(2.5, 2.9);
		
		int[] arr = {2,3,4,4,5};
		
		int result4 = m.addition(arr);
		
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
//		System.out.print(null);
		
		
		

	}

}
