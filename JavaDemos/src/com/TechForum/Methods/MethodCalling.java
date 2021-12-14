package com.TechForum.Methods;

import java.util.Scanner;

public class MethodCalling {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Number1: ");
		int a= sc.nextInt();
		System.out.println("Please enter Number2: ");
		int b = sc.nextInt();
		
		
		MethodExample.GreaterNumber(a, b);
		System.out.println("");
		MethodExample.OddNumbers(a, b);
		System.out.println("");
		MethodExample me = new MethodExample();
		me.Calculator(a, b);
		sc.close();
	}
	

}
	