package com.java.CollectionFramework;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMap_Demo {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
		
		map.put(23, 1);
		map.put(56, 10);
		map.put(12, 100);
		map.put(89, 1000);
		
		System.out.println(map);
		
		
		//Getting set from map using entrySet() method.
//		Set entrySet =  map.entrySet();
//		
//		Iterator iterator = entrySet.iterator();
//		
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
		//Getting keySet from map using keySet() method.
//		Set<Integer> keySet = map.keySet();
//		
//		for (Integer key : keySet) {
//			System.out.println(map.get(key));
//		}
		
	}
}
