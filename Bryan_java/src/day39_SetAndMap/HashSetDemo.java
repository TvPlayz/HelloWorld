package day39_SetAndMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,1,2,3,1,2,3));
		
		System.out.println(list.size());
		
		System.out.println(list);
		
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.addAll(Arrays.asList(3,1,2,3,1,2,3));
		
		System.out.println(set.size());
		System.out.println(set);
		

	}

}
