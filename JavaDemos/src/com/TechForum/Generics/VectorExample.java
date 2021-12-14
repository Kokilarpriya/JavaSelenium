package com.TechForum.Generics;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> animals = new Vector<String>();
		  animals.add("Elephant");  
		  animals.add("Lion");  
		  animals.add("Deer");  
		  animals.add("Tiger");  
		  
		  System.out.println(animals.lastIndexOf("Deer"));
		  System.out.println();
		  
		  Vector<String> animals1 = (Vector<String>) animals.clone();
		  System.out.println(animals1);
		  
		  animals.addAll(animals1);
		  
		  for(String i:animals) {
			  System.out.println(i);
		  }
		  
		  
	}

}
