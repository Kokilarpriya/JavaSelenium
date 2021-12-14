package com.TechForum.CollectionsHomework;

import java.util.ArrayList;
import java.util.Scanner;

public class MainOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
		ArrayList<Integer> al2=new ArrayList<Integer>();
		System.out.println("Please enter the number of elements:");
		
		int n = Integer.parseInt(sc.nextLine());
		System.out.println("Enter "+ n+" elements for the first array");
		for(int i=0;i<n;i++) {
			al1.add(sc.nextInt());
		}
		System.out.println();
		System.out.println("Enter "+ n+" elements for the second array");
		for(int j=0;j<n;j++) {
			al2.add(sc.nextInt());
		}
		
		System.out.println("Given elements in the first array:"+al1);
		System.out.println();
		System.out.println("Given elements in the second array:"+al2);
		
		UserMainCodeOddEven.generateOddEvenList(al1, al2);
	}

}
