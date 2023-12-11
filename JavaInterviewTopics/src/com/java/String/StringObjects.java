package com.java.String;

public class StringObjects {

	public static void main(String[] args) {
		
		String string1 = "Rushikesh";
		
		String string2 = "Rushikesh";
		
		String string3 = new String("Rushikesh");
		
		//== check the memory location of objects
		//string1 object is present in string pool. if we create 
		//another string with same content then the location of that
		//object is mapped to new variable i.e. string2.
		//So string1 and string2 have same memory location
		if(string1==string2) {
			System.out.println("== is true");
		}else {
			System.out.println("== is false");
		}
		
		
		
		// equals() will check the content of the string
		if (string1.equals(string3)) {
			System.out.println("equals() is true");
		} else {
			System.out.println("equals() is false");
		}
		
		
	}
	
}
