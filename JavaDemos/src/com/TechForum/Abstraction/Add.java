package com.TechForum.Abstraction;

public class Add extends Calculator{
	@Override
	public int calculate(int a, int b) {
		int c = a+b;
		System.out.println("Sum: "+c);
		return c;
	}
}
