package com.TechForum.CollectionsHomework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UserMainCodeOddEven {
	public static Map<Integer, Integer> generateOddEvenList(ArrayList<Integer> al1, ArrayList<Integer> al2){
		
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		
		//Array 1 odd elements
		for (int i = 0; i < al1.size(); i++) {

			if (i % 2 != 0) {
				map1.put(i, al1.get(i));
			}
		}
		System.out.println();
		System.out.println("Fetch odd index elements from first array:" + map1);
		
		//Array 2 even elements
		for (int i = 0; i < al2.size(); i++) {

			if (i % 2 == 0) {
				map1.put(i, al2.get(i));
				
			}
		}
		System.out.println();
		System.out.println("Add even index elements from second array:" + map1);
		System.out.println();
		System.out.println("-----Final Output according to their index-----");
		System.out.println(map1.values());
		return map1;
		
		
	}
	
}
