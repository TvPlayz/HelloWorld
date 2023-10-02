package day03_variables;

public class Public_class {

	public static void main(String[] args) {
	
		String exclaim = addExclamationPoint("hot dogs");
		System.out.println(exclaim);
		
	}

	public static String addExclamationPoint(String s) {
		return s + "!";
	}
	
}
