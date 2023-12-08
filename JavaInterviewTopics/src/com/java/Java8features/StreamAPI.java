package com.java.Java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		
		//3 ways to make list
		List<Integer> list1 = List.of(1,2,3,4);
		
		List<Integer> list2 = new ArrayList<>();
		
		list2.add(23);
		list2.add(45);
		list2.add(56);
		list2.add(88);
		
		List<Integer> list3 = Arrays.asList(23,45,67,14,68,68,67,23);
		
		
		//Filtering objects using stream
		Stream<Integer> stream = list1.stream();
		List<Integer> collect = stream.filter( (n)-> n%2==0 ).collect(Collectors.toList());
		
		//alternative for above 2 lines
		List<Integer> collect2 = list2.stream().filter(n->n%2==0).collect(Collectors.toList());
		
		//function in stream
		//1. forEach() method - uses consumer functional interface
		//collect.forEach(n->System.out.print(n+" "));
		
		//2. filter() method - takes single input & outputs predicate i.e. true or false
		//long count = list3.stream().filter((n)-> n>50).count();
		//System.out.println(count);
		
		//3. map() method - take single input and outputs value. uses function functional interface
		//list3.stream().map(n->n*n).forEach(n->System.out.println(n));
		
		//4. distinct() method - outputs distinct elements
		//list3.stream().distinct().forEach(n->System.out.println(n));
		
		//5. sorted() method - sort the give list.
		//list3.stream().sorted().forEach(n->System.out.println(n));
		
		//6. collect() method - collect the processed(filtered/sorted) objects
		//List<Integer> collect3 = list3.stream().filter(n->n>50).collect(Collectors.toList());
		//System.out.println(collect3);
		
		//7. max() & min() method - find the maximum and minimum in list using compare
		//Integer maxNumber = list3.stream().max((x,y)->x.compareTo(y)).get();
		//Integer minNumber = list3.stream().min((x,y)->x.compareTo(y)).get();
		//System.out.println(minNumber);
		
		
		
	}
	
	
}
