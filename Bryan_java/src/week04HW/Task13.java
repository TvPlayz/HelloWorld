package week04HW;

public class Task13 {

	public static void main(String[] args) {
		
//		Create a class called EmailTask2. Assume that email address is constructed
//		by person's first name
//		and followed by an underscore and last name.
//
//		Write a program that will print out information about user based on email.
//		Print first name, last
//		name, and domain.
//
//		First and Last name should be printed with proper format
//		- uppercase first letter and remaining
//		lowercase.
//
//		```text
//		Ex:
//		input:
//		techcircle_school@aws.com
//
//		Output:
//		First name: Techcircle
//		Last name: School
//		Domain: aws
//		```

		String email = "techcircle_school@aws.com".toLowerCase();
		String firstName = email.substring(0, email.indexOf('_'));
		String lastName = email.substring(email.indexOf('_') + 1, email.indexOf('@'));
		String domain = email.substring(email.indexOf('@') + 1, email.indexOf('.'));

		firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
		lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);

		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
		System.out.println("Domain: " + domain);
	}

}
