package com.TechForum.JavaPrograms;

import java.util.Scanner;

public class SwapNumbers {
	int a;
	int b;

	void swap(SwapNumbers sn)
	{
		
	    int tmp=sn.a;
	    sn.a=sn.b;
	    sn.b=tmp;
	}

	void get()
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter value1: ");
	    a=sc.nextInt();
	    System.out.print("Enter value2:");
	    b=sc.nextInt();
	    sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapNumbers sn = new SwapNumbers();
		sn.get();
		System.out.println("\"Call by object reference\"");
		sn.swap(sn);
		System.out.println("After swaping value1= "+sn.a+" and value2= "+sn.b);
	}

}
