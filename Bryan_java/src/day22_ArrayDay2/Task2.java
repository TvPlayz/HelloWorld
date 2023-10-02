package day22_ArrayDay2;

import java.util.Arrays;

public class Task2 {

	public static void main(String[] args) {
		
		int arr[] = new int[100];
        System.out.println(Arrays.toString(arr));
        
//        int value = 1;
        
        for (int i = 0 ; i < arr.length ; i++) {
            //System.out.println(i);
            
//            arr[i] = value;
//            value++;
            
            int num = i + 1;
            arr[i] = num;
            
        }
        
        System.out.println(Arrays.toString(arr));

        
		 
		 
	}

}
