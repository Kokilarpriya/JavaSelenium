package com.TechForum.Contructors;

public class Demo {

	public Demo() {
		// Default or zero argument constructor
		System.out.println("zero argument");
	}
	
	Demo(int a){
		System.out.println("int argument");
	}
	
	Demo(double a){
		System.out.println("double argument");
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		Demo e = new Demo(20);
		Demo f = new Demo(20f);
	}

}
