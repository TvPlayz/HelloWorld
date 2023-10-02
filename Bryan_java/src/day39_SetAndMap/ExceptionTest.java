package day39_SetAndMap;

import java.io.FileNotFoundException;

public class ExceptionTest {
	public static void main(String[] args) throws FileNotFoundException {
		
		ThrowingException te = new ThrowingException();
		
		te.methodA();
		
		System.out.println("Line Number 10");
		
		try {
			te.methodB();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Line Number 21");
		
		te.methodB();
		
		

	}

}
