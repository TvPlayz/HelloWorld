package day27_arrayList;

public class Task01 {

	public static void main(String[] args) {
		
		String password = "Password@1";
	
		boolean has8charNoSpace = true;
		boolean hasUpperCase = false;
		boolean haslowerCase = false;
		boolean hasSpecialChar = false;
		boolean hasDigit = false;
		
		for (int i = 0; i < password.length(); i++) {
//			System.out.println(i);
			if(password.length() >= 8 && !password.contains(" ")) {
				System.out.println(" Validate rest of the condition");
				
				for (char c : password.toCharArray()) {
					System.out.println(c);
					if (Character.isUpperCase(c)) {
						hasUpperCase = true;
					}
					if (Character.isLowerCase(c)) {
						haslowerCase = true;
				}
					if (!Character.isLetter(c) && !Character.isDigit(c)) {
						hasSpecialChar = true;
					}
					if (Character.isDigit(c)) {
						hasDigit = true;
				}
			}
			
		}
		
			boolean isStrongPassword = has8charNoSpace && hasUpperCase && haslowerCase && hasDigit && hasSpecialChar;
			System.out.println(isStrongPassword);
		}
	}
}
