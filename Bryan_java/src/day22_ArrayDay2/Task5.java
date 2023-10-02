package day22_ArrayDay2;

import java.util.Arrays;

public class Task5 {

	public static void main(String[] args) {
		
		/*
		Create string array, and store the names of your  class mates (10)
		 reverse each students names and print them in separate lines
		                ex:
		                    arr = {java, python, c#}
		                output:
		                    avaJ
		                    nohtyp
		                    #c
		*/
		
		String[] classmates = new String[10];
		
		classmates[0] = "Bryan Chavez";
		classmates[1] = "Hello World";
		classmates[2] = "Um Lol";
		classmates[3] = "MQ QM";
		classmates[4] = "Hi Bye";
		classmates[5] = "Fly Guy";
		classmates[6] = "Cody Joe";
		classmates[7] = "Wall Blue";
		classmates[8] = "Sea Lee";
		classmates[9] = "For Me";
		
		String reverse = "";
//		System.out.println(Arrays.toString(classmates));
		for (String str : classmates) {
		for (int i = str.length()-1; i >= 0; i--) {
			reverse += str.charAt(i);
			}
		}
		System.out.println(reverse);
		

	}

}
