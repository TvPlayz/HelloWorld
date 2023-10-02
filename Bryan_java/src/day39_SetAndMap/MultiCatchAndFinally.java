package day39_SetAndMap;

public class MultiCatchAndFinally {

	public static void main(String[] args) {
		
		String arr[] = {"Apple","Orange","Grapes","Banana","Pear", null};
		try {
		for (int i = 0; i <= arr.length; i++) {
			System.out.println(arr[i]);
			System.out.println(arr[i].charAt(3));
			
			System.out.println(arr[i].charAt(13));
		}
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch (NullPointerException e) {
			System.out.println("element is null");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Finally block alway executes");
		}
		
		System.out.println("I'm here");
		
		
	}

}
