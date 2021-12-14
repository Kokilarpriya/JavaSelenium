package com.TechForum.Generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListRemoveMultiplesofThree {
	public static void main(String[] args) {

		//Scanner in = new Scanner(System.in);
		//System.out.println("Enter the size of the array");


		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<Integer>();
		ArrayList<Integer> al1=new ArrayList<Integer>();
		System.out.println("Enter the array size:");
		int n=Integer.parseInt(sc.nextLine());
		System.out.println("Enter "+ n+" elements");
		for(int i=0;i<n;i++)
		{
			al.add(sc.nextInt());
		}
		al1=UserMainCodeRemoveMultiplesOfThree.removeMultiplesOfThree(al);
		Iterator it=al1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}


