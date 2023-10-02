package day22_ArrayDay2;

import java.util.Arrays;

public class Task3 {

	public static void main(String[] args) {
		Integer arr[] = { 1, 2, 3, 4, 5 };
		
		for (int i = 4; i >=0 ; i--) {
			System.out.println(arr[i]);}
		 
        Arrays.sort(arr);
 
        System.out.println(Arrays.toString(arr));

	}

}
