package day38_exceptions;

import java.io.File;
import java.io.FileReader;

public class CheckedExceptions {
public static void main(String[] args) {
	
	File file = new File("C:\\Users\\USER\\eclipse-workspace\\Bryan_java\\src\\day38_exceptions");
	
	try {
		FileReader fr = new FileReader(file);
	}catch(Exception e) {
//		System.out.println("File is not found");
		e.printStackTrace();
	}
	
	System.out.println("line number 17");
	
}
	
	
}
