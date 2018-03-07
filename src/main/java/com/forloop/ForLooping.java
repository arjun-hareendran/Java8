package com.forloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForLooping {

	public static void main(String[] args) {
		
		List<String> arraylist = new ArrayList<String>(Arrays.asList("Arjun","Amith","Jimmy"));
		
		System.out.println("Standard  For loop");
		for(int i=0; i< arraylist.size();i++) {
			System.out.println(arraylist.get(i));
		}

		System.out.println("For in loop");
		for (String name : arraylist) {
			System.out.println(name);
		}
		
		System.out.println("===> Lambda");
		arraylist.forEach((x) -> System.out.println(x));
		
		System.out.println("Method Reference");
		arraylist.forEach(System.out::println);
		
		
		

	}

}
