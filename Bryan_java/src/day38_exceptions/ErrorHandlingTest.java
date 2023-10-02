package day38_exceptions;

public class ErrorHandlingTest {

	public static void main(String[] args) {
		
		try{
		int result = 5/0;
		System.out.println(result);
		System.out.println("line number 7");
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("line number 16");

	}

}
