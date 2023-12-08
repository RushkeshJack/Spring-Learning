package com.java.CollectionFramework;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_Demo {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		
		set.add(72);
		set.add(23);
		set.add(59);
		set.add(44);
		set.add(88);
		set.add(47);
		set.add(36);
		set.add(null);
		set.add(null); //Only single null value allowed as duplicate elements not allowed
		
		Iterator<Integer> iterator  =  set.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}
	
}
