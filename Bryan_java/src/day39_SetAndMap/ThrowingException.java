package day39_SetAndMap;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowingException {

	void methodA() {
		File f = new File("location");
		try {
			FileReader fr = new FileReader(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void methodB() throws FileNotFoundException {
		File f = new File("location");
		FileReader fr = new FileReader(f);
	}
	
	
}
