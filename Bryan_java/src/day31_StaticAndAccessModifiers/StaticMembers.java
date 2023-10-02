package day31_StaticAndAccessModifiers;

import java.time.LocalTime;

public class StaticMembers {

	String name = "Techcircle";
	
	static String topic = "JAVA STATIC";
	
	public static void WhatTimeIsIt() {
		System.out.println("It is " + LocalTime.now());
	}
	
	
	public void study() {
		System.out.println("Learning static and non static access modifiers");
	}
	
}
