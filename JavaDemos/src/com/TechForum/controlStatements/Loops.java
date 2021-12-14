package com.TechForum.controlStatements;

public class Loops {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 1;
		while(counter<=5) {
			System.out.println("counter value is "+counter+" so im printing this");
			counter++;
		}
		System.out.println("counter value became "+counter+" so im coming out of the loop");
		
		//while increment
		int i=1;
		while(i<=10) {
			System.out.print(i+" ");
			i++;
		}
		System.out.print("\n");
		//while decrement
		int x=10;
		while(x>=1) {
			System.out.print(x+" ");
			x--;
		}
		System.out.print("\n");
		//do while 
		int y=10;
		do {
			System.out.print(y+" ");
			y--;
		}while(y>=1);
		System.out.print("\n");
		// do while
		int z= 6;
		do {
			System.out.print(z+" ");
			z++;
		}while(z<=5);
		System.out.print("\n");
		
		//For loop print odd numbers
		for(int k =1;k<=10; k=k+2) {
			
			//if(k %2 !=0);
			System.out.print(k+" ");
		}
		System.out.print("\n");
		//For loop print even numbers
		for(int k =0;k<=10; k=k+2) {
				System.out.print(k+" ");
		}
	}

}
