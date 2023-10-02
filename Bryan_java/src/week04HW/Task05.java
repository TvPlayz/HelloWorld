package week04HW;

public class Task05 {

	public static void main(String[] args) {
		
//		Your team has created a new bank website that requires email address to be validated. The email
//		string must contain an '@' character. The email string must contain an '.' character. The '@' must
//		contain at least one character in front of it. e.g. "a@example.com" is valid while "@example.com" is
//		invalid. The '.' and '@' must be in the appropriate places. e.g. "mike.smith@com" is invalid while "
//		mike.smith@example.com" is valid. For a given string, find a solution that writes true on the
//		console if an email is valid and false if it is invalid.
		
		String email = "mike.example@tech.com";
		int position0fAt = email.indexOf('@');
		int positionOfLastPeriod = email.lastIndexOf('.');
		if (position0fAt > 0 && positionOfLastPeriod > position0fAt)
			System.out.println("Valid Email address");
		else
			System.out.println("Invalid Email address!!");

	}

}
