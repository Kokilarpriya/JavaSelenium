package com.TechForum.Casting;

class one{
	void m1() {
		System.out.println("m1 method in class one");
	}
}

class two extends one{
	void m2() {
		System.out.println("m2 method in class two");
	}
}
public class test2 {
	public static void main(String[] args) {
		
		//upcasting
		one o = (one)new two();
		
		//here super class reference o refers to subclass object
		o.m1();
		//o.m2();//will get error
		
		
		//downcast
		//two t = (two)new one();//class cast exception
		one o1 = new two();
		two t1 = (two)o1;
		t1.m2();
		t1.m1();
		
		
	}
}
