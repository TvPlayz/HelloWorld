package day27_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_AsList {

	public static void main(String[] args) {
	
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		
		System.out.println(list.size());
		System.out.println(list);
		
		
		ArrayList<String> names = new ArrayList<>(Arrays.asList("Nadia","Sharife","Anum","Gautam"));
		
		System.out.println(names);
		
		
//		read value
		System.out.println(names.get(0));
		System.out.println(names.get(3));
		
		names.add("Ngan");
		
		System.out.println(names.get(4));
		
		
		System.out.println(names.size()-1);
		
		System.out.println(names.get(names.size()-1));
	}

}
