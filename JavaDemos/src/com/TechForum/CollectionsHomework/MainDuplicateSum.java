package com.TechForum.CollectionsHomework;

import java.util.ArrayList;
import java.util.Scanner;

public class MainDuplicateSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("Please enter the number of elements:");
		int n=Integer.parseInt(sc.nextLine());
		System.out.println("Enter "+ n+" elements");
		for(int i=0;i<n;i++)
		{
			al.add(sc.nextInt());
		}
		
		
		System.out.println("Given elements in the array:"+al);
		
		Integer sumOfEven = UserMainCodeDuplicateSum.sumEvenElements(al);
		System.out.println();
		System.out.println("-----Final output------");
		if (sumOfEven != 0 )
			System.out.println("Sum of even numbers:"+sumOfEven);
		else
			System.out.println("There are no even numbers: -1");
	}

}
