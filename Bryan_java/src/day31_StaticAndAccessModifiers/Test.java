package day31_StaticAndAccessModifiers;

public class Test {

	public static void main(String[] args) {
		
		StaticMembers.WhatTimeIsIt();
		
		System.out.println(StaticMembers.topic);
		
//		System.out.println(StaticMembers.name);
		
		StaticMembers sm = new StaticMembers(); // class instantiation
		
		sm.study();
		
		System.out.println(sm.name);
		
		StaticMembers.WhatTimeIsIt();
//		StaticMembers.study();
		
		

	}

}
