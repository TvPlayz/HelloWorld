package day25_method;

import java.util.Arrays;

public class MethodDemo {

		
//		Syntax:
//			
//			accesModifier returnType methodName (parameter list) {
//			code block
//		}

//		acessModifiers --> public or private or protected or default
//		returnType:
//			1, void --> method will run execute the code inside of the code block but it will not return any value
//			2, dataType that you want to return after executing the code block.
//		methodName --> name of your code block
//		parameter list --> list of local variable that used inside of your code block.
//		static --> belong to class not instance
		
		
	public void sayHello() {
		System.out.println("Hello");
		}
		
	public void sayHello10Times() {
			for (int i = 1; i< 11; i++) {
				System.out.println("Hello");
			}
		}
		
	public void addition( int a ,int b) {
		System.out.println(a + b);
		}
	
	public void printMultiplicationTable(int num) {
			for (int i = 1; i < 11; i++) {
			
			int result = num*i;
			
			System.out.println(num + " X " + i+ " = "+ result);
		}
	}
	
	public void printMaxValueFromAnIntegerArray(int[] arr) {
		Arrays.sort(arr);
		System.out.println(arr[arr.length - 1]);
	}
			
		

}

