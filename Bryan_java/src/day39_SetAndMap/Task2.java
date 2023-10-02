package day39_SetAndMap;

import java.util.*;

public class Task2 {
public static void main(String[] args) {

//  write a method to get string and return as below:
//  aaaabbcccdda==> a5b2c3d2

	Map<Character, Integer> map = new HashMap<>();
	String str = "aaaabbcccdda";
	
	for(char c : str.toCharArray()) {
		System.out.println(c);
		
		if(!map.containsKey(c)) {
			map.put(c,1);
		}else {
			map.put(c, map.get(c)+1);
		}
	}
	
	System.out.println(map);
	}   
}