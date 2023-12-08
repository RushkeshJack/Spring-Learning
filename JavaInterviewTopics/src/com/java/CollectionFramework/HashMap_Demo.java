package com.java.CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap_Demo {

	public static void main(String[] args) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		map.put(22, 3);
		map.put(89, 13);
		map.put(4, 33);
		map.put(1, 25);
		map.put(1, 55);
		map.put(2, 13);
		map.put(null, 1);
		
		System.out.println(map);
		
	    System.out.println("containsKey method - "+map.containsKey(40));
	    
	    System.out.println("remove method - "+map.remove(4));
	    
	    for(Map.Entry<Integer, Integer> map2 : map.entrySet()) {
	    	System.out.println(map2.getKey()+" "+map2.getValue());
	    	System.out.println();
	    }
	    
	    System.out.println(map.values());
		
	}
	
}
