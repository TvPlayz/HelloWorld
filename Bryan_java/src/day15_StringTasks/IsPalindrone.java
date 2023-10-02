package day15_StringTasks;

public class IsPalindrone {

	public static void main(String[] args) {

		String str = "level";
		String reverseStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverseStr += str.charAt(i);
		}

		if (str.equalsIgnoreCase(reverseStr)) {
			System.out.println(str + " Is Palindrone");
		} else {
			System.out.println(str + " Is not Palindrone");
		}

	}
}
