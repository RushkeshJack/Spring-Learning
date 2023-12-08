package com.java.CollectionFramework;

import java.util.LinkedList;

public class LinkedList_Demo {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(23);
		list.add(45);
		list.add(78);
		list.add(65);
		list.add(null);
		list.add(null);
		
		list.forEach(n -> {
			System.out.println(n);
		});
		
		System.out.println("getFirst method - "+list.getFirst());
		
		System.out.println("getLast method - "+list.getLast());
		
		System.out.println("removeLast method - "+list.removeLast());
		
		list.addFirst(null);
		
		
	}
	
}
