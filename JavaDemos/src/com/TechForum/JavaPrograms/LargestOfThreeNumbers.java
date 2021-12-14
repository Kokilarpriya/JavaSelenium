package com.TechForum.JavaPrograms;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public LargestOfThreeNumbers() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter three numbers to find the largest among them:");
		System.out.print("Please enter Number1:");
		int a = sc.nextInt();
		System.out.print("Please enter Number2:");
		int b = sc.nextInt();
		System.out.print("Please enter Number3:");
		int c = sc.nextInt();
		
		new LargestOfThreeNumbers().compareNumbers(a, b, c);
		sc.close();
	}

	public void compareNumbers(int a,int b, int c) {
		if(a>b) {
			if(a>c) {
				System.out.println("The largest among three numbers is: "+a);
			}
			else {
				System.out.println("The largest among three numbers is: "+c);
			}
			
		}else if(b>c) {
			System.out.println("The largest among three numbers is: "+b);
		}
		else {
			System.out.println("The largest among three numbers is: "+c);
		}
	}
}
