package com.TechForum.Abstraction;

public class Subtract extends Calculator {

	@Override
	public int calculate(int a, int b) {
		// TODO Auto-generated method stub
		int c = a-b;
		System.out.println("Difference: "+c);
		return 0;
	}

}
