package day39_SetAndMap;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> phoneBook = new HashMap<>();
		
//		ArrayList<String> list = new ArrayList<>();

//ArrayList<String> list = new ArrayList<>();
        
        
        // add value to map
        
        phoneBook.put("Rinat", 2021231234);
        
        phoneBook.put("MQ", 202123124);

        phoneBook.put("April", 202123125);

        phoneBook.put("Summer", 201123000);

        
        System.out.println(phoneBook.size());
        
        // read value
        System.out.println(phoneBook.get("April")); //202123125
        
        System.out.println(phoneBook.get("Rinat"));
        
        
        System.out.println(phoneBook.get("Summer"));

        phoneBook.put("Summer", 2011231111);

        System.out.println(phoneBook.get("Summer"));

        phoneBook.put("Saroj", 2011231111);

        System.out.println(phoneBook.get("Saroj"));

        System.out.println(phoneBook.containsKey("Zach"));
        
        System.out.println(phoneBook.containsValue(2011231111));

        
        
        for (Map.Entry<String , Integer> entry : phoneBook.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : "+ value);
        }
        
        System.out.println(phoneBook);
        
        phoneBook.remove("MQ");
        
        System.out.println(phoneBook);

        
phoneBook.clear();
        
        
System.out.println(phoneBook);

        
        
        
        
        
        
        
        
        
        
        
	}

}
