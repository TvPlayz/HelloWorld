package day35_polymorphism;

public class MethodOverLoading {
	
//	method overloading --> having more than one method 
//	with same name and different parameters in the same class.
//	return type can be different

	public int addition (int a, int b) {
		return a + b;
	}
	
	public double addition (double a, int b) {
		return a + b;
	}
	
	public double addition (double a, double b) {
		return a + b;
	}
	
	public int addition (int a, int b, int c) {
		return a + b + c;
	}
	
	public int addition (int[] arr) {
		
		int total = 0;
		
		for (int num : arr) {
			total += num;
		}
		
		return total;
	}
	
	public int subtraction(int a , int b) {
		return a - b;
	}
	
	public int muiltiplication(int a, int b) {
		return a * b;
	}
	
	public int division(int a, int b) {
		return a / b;
	}
	
}
