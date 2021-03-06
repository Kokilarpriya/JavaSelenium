package com.TechForum.CollectionsHomework;

import java.util.HashSet;
import java.util.Iterator;

public class UserMainCodeUniqueChar {
	public static int checkUnique(String s) {
		int numOfUniqueChar = 0;

		char arr[] = s.toCharArray();

		HashSet<Character> set1 = new HashSet<Character>();
		HashSet<Character> set2 = new HashSet<Character>();

		for (char i : arr) {
			if (set1.contains(i)) {
				set1.add(i);
				set2.remove(i);

			} else {

				set1.add(i);
				set2.add(i);
			}
		}

		System.out.println(set2);

		System.out.println("Unique characters in the given string: " + set2);
		System.out.println();
		numOfUniqueChar = set2.size();

		if (numOfUniqueChar == 0) {
			numOfUniqueChar = -1;
		}

		return numOfUniqueChar;
	}

	public static int checkUniqueChar(String s1) {
		int numOfUniqueChar = 0;

		try {
			HashSet<Object> h = new HashSet<Object>();
			for (int i = 0; i < s1.length(); i++) {
				h.add(s1.charAt(i));
			}
			Iterator<Object> itr = h.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
			numOfUniqueChar = h.size();
		} catch (Exception e) {
			System.out.println("error");
		}

		if (numOfUniqueChar == 0) {
			numOfUniqueChar = -1;
		}

		return numOfUniqueChar;

	}
}
