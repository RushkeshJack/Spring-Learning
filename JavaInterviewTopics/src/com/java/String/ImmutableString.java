package com.java.String;

public class ImmutableString {

	public static void main(String[] args) {
		
		String name =  "Rushikesh";
		
		//In this case, new string object is getting created
		//and reference to that string object is mapped to name variable.
		//string object with content "Rushikesh" is now alone in heap
		//(no one pointing to that location).
		
		name = "Devdatta";
		
		System.out.println(name);
		
	}
	
}
