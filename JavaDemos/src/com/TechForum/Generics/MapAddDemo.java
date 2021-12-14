package com.TechForum.Generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapAddDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<>();
		
		boolean isEmpty = map.isEmpty();
		System.out.println("Is map empty?"+isEmpty);
		
		map.put(101,"Red");
		map.put(102, "Orange");
		
		int size = map.size();
		System.out.println("Map size:"+map);
		
		Map<Integer, String> map2 = new HashMap();
		map2.put(115, "Brown");
		map2.put(120, "Purple");
		
		map.putAll(map2);
		System.out.println("Entries in updated map:"+map2);
		
		//Entry set
		Iterator<Entry<Integer,String>> itr = map2.entrySet().iterator();
		while(itr.hasNext()) {
			Object key = itr.next();
			System.out.println(key);
		}
		//Map<String>
		
		//Key set
		//Iterator<Integer> itr1 = map2.keySet().iterator();
		//while(itr1.hasNext()) {
		//	Object keyView = itr.next();
			
		//	System.out.println(keyView);
		//}
		
		//String value = map.get(101);
		//System.out.println(value);
		
		
	}

}
