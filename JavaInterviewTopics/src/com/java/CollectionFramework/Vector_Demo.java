package com.java.CollectionFramework;

import java.util.Vector;

public class Vector_Demo {

	public static void main(String[] args) {
		
		Vector<Integer> list = new Vector<>();
		
		list.add(23);
		list.add(45);
		list.add(78);
		list.add(65);
		list.add(null);
		list.add(null);
		
		list.forEach(n -> {
			System.out.println(n);
		});
		
		
		
	}
	
}
