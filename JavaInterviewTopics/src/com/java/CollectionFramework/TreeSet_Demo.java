package com.java.CollectionFramework;

import java.util.TreeSet;

public class TreeSet_Demo {

	public static void main(String[] args) {
		
		TreeSet<String> set =  new TreeSet<>();
		
		set.add("Mouse");
		set.add("Cat");
		set.add("Dog");
		set.add("Lion");
		//set.add(null); //does not allow null value
		
		System.out.println(set);
		
        TreeSet<Integer> set2 =  new TreeSet<>();
		
		set2.add(1);
		set2.add(4);
		set2.add(56);
		set2.add(232);
		
		System.out.println(set2);
		
		
	}
	
}
