package day27_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class LoopingAnArrayList {

	public static void main(String[] args) {
		
	ArrayList<String> names = new ArrayList<>(Arrays.asList("Nadia","Sharife","Anum","Gautam"));
		names.add("Ngan");
		
		System.out.println("For Loop");
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		
		// for each loop
		System.out.println("For each Loop");
		
		for (String name : names) {
			System.out.println(name);
		}

		
		// while loop
		System.out.println("For while Loop");
		
		int index = 0;
		
		while (index < names.size()) {
			System.out.println(names.get(index));
			index++;
		}
		
		// do while loop
		
		System.out.println("Do While Loop");
		index = 0;
		do {
			System.out.println(names.get(index));
			index++;
		}while(index < names.size());
		
		System.out.println("------------------------------");
		
		Iterator<String> iterator = names.iterator();
		
//		System.out.println(names);
//		
//		System.out.println(iterator.hasNext());
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		iterator.next();
//		System.out.println(iterator.next());
//		System.out.println(iterator.hasNext());
//		System.out.println(iterator.next());
//		System.out.println(iterator.hasNext());
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
