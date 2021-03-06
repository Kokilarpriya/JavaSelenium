package com.TechForum.Generics;

public class GenericClass<T> {
	
	T obj;
	
	GenericClass(T obj){
		this.obj = obj;
	}
		//Declare an instance method 
	T getObject() {
		return obj;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an object of Integer class
		Integer i = 20;// This is same as Integer i = new Integer(20);
		//Create an object of  GenericClass and store Integer object to it
		GenericClass<Integer> obj = new GenericClass<Integer>(i);
		//call getObject() method to get Integer object
		System.out.println("Stored integer value: "+obj.getObject());
		
		
		String str ="I am string";
		GenericClass<String> obj3 = new GenericClass<String>(str);
		System.out.println("Stored string value: "+obj3.getObject());
		
		
		Integer i2 = new Integer(20);
		i2.intValue();

	}

}
