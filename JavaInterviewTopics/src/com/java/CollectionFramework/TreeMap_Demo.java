package com.java.CollectionFramework;

import java.util.Set;
import java.util.TreeMap;

public class TreeMap_Demo {

	public static void main(String[] args) {
		
		TreeMap<Integer, Integer> map = new TreeMap<>();
		
		map.put(12, 12);
		map.put(1, 11);
		map.put(1234, 14);
		map.put(123, 13);
		map.put(1234, null);
		
		Set<Integer> keySetOfMap = map.keySet();
		
		for(Integer keyset : keySetOfMap) {
			System.out.println(keyset+" - "+ map.get(keyset));
		}
		
		map.remove(12);
		
		System.out.println(map);
	}
	
}
