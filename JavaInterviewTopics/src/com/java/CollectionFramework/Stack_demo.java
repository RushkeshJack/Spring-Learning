package com.java.CollectionFramework;

import java.util.Stack;

public class Stack_demo {
	public static void main(String[] args) {
		
		Stack<Integer> list =  new Stack<>();
		
		list.push(34);
		list.push(89);
		list.push(15);
		list.push(19);
		list.add(null);
		list.add(null);
		
		list.forEach(n -> {
			System.out.println(n);
		});
		
		System.out.println("Pop operation - "+list.pop());
		
		System.out.println("Peek method(Top element of stack) - "+list.peek());
		
		System.out.println("Search method(Search element and return index) - "+list.search(88));
		
		System.out.println("isEmpty method - "+list.isEmpty());
	}

}
