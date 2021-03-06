package com.TechForum.Generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s = new HashSet<String>();
		int size = s.size();
		System.out.println("Size before adding elements: " + size);
		
		s.add("orange");
		s.add("Red");
		s.add(null);
		//s.add("Null");
		s.add("yellow");
		s.add("Green");
		//Add duplicate elements
		s.add("Red");
		s.add("Blue");
		
		System.out.println(s.size());
		
		System.out.println("Unordered set elements");
		System.out.println(s);
		
		if(s.equals("Black"))
		{
			System.out.println("Black element us not present");
		}
		
		else {
			s.add("Black");
			System.out.println("Black is added");
			System.out.println(s);
		}
		//create another set 
		
		Set<String> s2 = new LinkedHashSet<String>();
		
		s2.add("White");
		s2.add("Brown");
		s2.add("Red");
		
		Iterator itr = s2.iterator();
		while(itr.hasNext()) {
			Object str = itr.next();
			System.out.println(str);
		}
		
		for(String it:s)
		{
			System.out.println(it);
		}
		
		//Java 8
		
		System.out.println("Iteration using Java 1.8");
		
		s.forEach(System.out::println);//Method reference
		
		
	}

}
