package day39_SetAndMap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicateFromAnArray {
	public static void main(String[] args) {
	
		String arr[] = {"Apple","Orange","Grapes","Orange","Banana","Banana","Pear","Grapes"};
		
		Set<String> uniqueList = new HashSet<>(Arrays.asList(arr));
		
//		for (String s : arr) {
//			uniqueList.add(s);
//		}
		
		System.out.println(uniqueList);
		
		for(String s : uniqueList) {
			System.out.println(s);
		}
		
		Iterator<String> i = uniqueList.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
