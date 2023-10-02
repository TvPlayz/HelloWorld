package day15_StringTasks;

public class PhoneNumberFormatter {

	public static void main(String[] args) {
		
		String phoneNumber = "7031231234";
//		output = (703) 123-1234
		
//		System.out.println(phoneNumber.length()-1);
		String one = phoneNumber.substring(0,3);
		String two = phoneNumber.substring(3,6);
		String three = phoneNumber.substring(6);
		String formattedPhoneNumber = "("+one+") "+two+"-"+three;
		
		System.out.println(formattedPhoneNumber);
		

	}

}
