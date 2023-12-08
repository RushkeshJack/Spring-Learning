package com.java.CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Demo {
	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<>();
		
		set.add(23);
		set.add(45);
		set.add(78);
		set.add(65);
		set.add(null);
		set.add(null); //adds only unique elements
		
		Iterator iterator = set.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("contains method - "+set.contains(23));
		
		set.remove(65);
		System.out.println(set);
		
	}

}
