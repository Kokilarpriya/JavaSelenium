package com.TechForum.Generics;

import java.util.ArrayList;

public class UserMainCodeRemoveMultiplesOfThree {
	public static ArrayList<Integer> removeMultiplesOfThree(ArrayList<Integer> al) {
		for (int i = 1; i < al.size(); i++) {

			if (i % 3 == 0) {
				al.remove(i);
				System.out.println("size:" + al.size());
			}
		}

		return al;

	}
}
