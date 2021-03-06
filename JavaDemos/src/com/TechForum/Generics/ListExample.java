package com.TechForum.Generics;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	// List<String> p = new ArrayList<String>();
	public static void main(String[] args) {

		@SuppressWarnings("rawtypes")
		List p = new ArrayList(); // no type safety
		p.add(20);
		p.add(40);
		p.add(60);
		p.add(80);
		p.add("Priya");
		p.add(4, 35); // adds at 4th place and moves to 5th place

		System.out.println(p);

		List<String> s = new ArrayList<String>();
		s.add("ab");
		s.add("cd");
		s.add("ef");
		s.add("gh");

		System.out.println(s);

		List<String> s1 = new ArrayList<String>();
		s1.add("ij");
		s1.add("kl");
		s1.add("mn");
		s1.add("op");

		System.out.println(s1);
		s.addAll(2, s1);
		System.out.println(s);

		System.out.println(s.indexOf("ij"));

		System.out.println(s.get(7));

	}

}

//List is sub interface of collections
//it has four concrete sub classes
//public interface List<E> extends Collection<E>