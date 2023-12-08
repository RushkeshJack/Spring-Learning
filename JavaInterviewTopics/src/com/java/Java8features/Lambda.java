package com.java.Java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda {
 
public static void main(String[] args) {
	
	 Operation operation = () -> {
		 System.out.println("Pring funtion executed");
	 };
	 
	 operation.print();
	 
	 
	 //Square the number
	 Operation2 operation2 = x -> x*x;
	 
	 System.out.println(operation2.square(4));
	 
	 //java 8 feature - forEach() method for looping the data
	 List<Integer> list = Arrays.asList(1,2,3,4);
	 list.forEach(n -> System.out.print(n));
	 System.out.println();
	 list.forEach( (n) -> {
		 if(n%2==0) {
			 System.out.print(n);
		 }
	 });
  }
}
