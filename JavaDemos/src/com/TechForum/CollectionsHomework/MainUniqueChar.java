package com.TechForum.CollectionsHomework;

import java.util.Scanner;

public class MainUniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string to find the number of unqiue chararcters:");
		String s = sc.nextLine();
		System.out.println();
		System.out.println("Number of unique characters in given string:"+UserMainCodeUniqueChar.checkUnique(s));
		//System.out.println("Number of unique characters in given string:"+UserMainCodeUniqueChar.checkUniqueChar(s));
	}

}
