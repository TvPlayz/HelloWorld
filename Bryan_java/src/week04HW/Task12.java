package week04HW;

public class Task12 {

	public static void main(String[] args) {
		
//		Create a class calledEmailTask1. Assume that email address is
//		constructed by person's first name and
//		followed by an underscore and last name.
//
//		Write a program that can swap first name with last name
//		in the email (Seperated by an underscore).
//		If the email doesn't contain an underscore print the given input email.
//
//		Ex:
//
//		```text
//		input: 
//		mike_tyson@gmail.com
//
//		output: 
//		tyson_mike@gmail.com
//		```

		String email = "ryan_gilford@gmail.com";
		int underScorePosition = email.indexOf('_');
		String name, lastName, swapNameEmail;

		if (email.indexOf('_') > -1) {
			name = email.substring(0, underScorePosition);
			lastName = email.substring(underScorePosition + 1, email.indexOf('@'));
			swapNameEmail = lastName + "_" + name + 
					        email.substring(email.lastIndexOf('@'));

			System.out.println(swapNameEmail);
		} else
			System.out.println(email);
	}

}
