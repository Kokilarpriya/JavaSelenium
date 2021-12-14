package com.TechForum.Generics;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapGetKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> numbers = new HashMap<>();
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Three", 3);
		
		System.out.println("HashMap:"+numbers);
		
		Integer value = 3;
		//Iterate each entry of hashmap
		for(Entry<String,Integer> entry: numbers.entrySet()) {
			
			if(entry.getValue() == value) {
				System.out.println("Key is "+ entry.getKey());
				break;
			}
		}
		
	}

}
