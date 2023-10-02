package day27_arrayList;

import java.util.ArrayList;

public class ArrayLIstMethod {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		
		System.out.println(names);
		
		System.out.println(names.size());
	
		names.add("Dilnaz");
		
		names.add("Zech");
		
		names.add("Saroj");
		
		System.out.println(names);
		
		names.add("Merfu");
		System.out.println(names);
		
		// Update element
		names.set(2, "Summer");
		System.out.println(names);
		
		names.set(3, "Adam");
		
		System.out.println(names);
		
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("April");
		list.add("MQ");
		list.add("Rinat");
		
		System.out.println(list);
		
		list.addAll(names);
		
		System.out.println(list);
		
		list.remove(0);
		
		System.out.println(list);
		
		list.remove("MQ");
		
		System.out.println(list);
		

	}

}
