package com.TechForum.CollectionsHomework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UserMainCodeDuplicateSum {
	public static Integer sumEvenElements(ArrayList<Integer> al){
		Integer sum = 0;
		Set<Integer> s = new HashSet<Integer>();
		s.addAll(al);
		System.out.println();
		System.out.println("After removing duplicate elements using set:"+s);
		
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			Integer str = (Integer) itr.next();
			if(str%2 == 0) {
				sum = sum +str;
			}
		}
		
		//System.out.println(sum);
		return sum;
	}
	
	
}
