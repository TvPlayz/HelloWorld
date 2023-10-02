package day38_exceptions;

public class ArrayIndexIssue {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);

		System.out.println(arr[6]);
		System.out.println(arr[0]);
	}

}
