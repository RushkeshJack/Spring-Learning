package com.java.CollectionFramework;

import java.util.*;

public class ArrayList_Demo {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(72);
		list.add(23);
		list.add(59);
		list.add(44);
		list.add(null);
		list.add(null);
		
		list.forEach(n -> {
			System.out.println(n);
		});
		
		System.out.println("get method - "+list.get(2));
		
		list.set(0, 25);
		System.out.println("set method - "+list);
		
		list.remove(3);
		System.out.println("remove method - "+list);
		
		System.out.println("size method - "+list.size());
		
		Collections.sort(list);
		System.out.println("sort using collections class method - "+ list);
		
		list.clear();
		System.out.println("clear method - "+list);
		
		
	}
	
}
