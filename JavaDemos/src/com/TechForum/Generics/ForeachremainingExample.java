package com.TechForum.Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class ForeachremainingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<Integer>();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(500);
		
		
		System.out.println(l);
		
		Stream<Integer> str = l.stream();
		Spliterator<Integer> spr = str.spliterator();
		spr.forEachRemaining((n)->System.out.println(n));
		
		
		
		
	}

}
