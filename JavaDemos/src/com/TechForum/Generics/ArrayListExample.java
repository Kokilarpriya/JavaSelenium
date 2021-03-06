package com.TechForum.Generics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Mango");
		al.add("Apple");
		al.add("Banana");
		al.add("Grapes");

		System.out.println(al);

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		ArrayList<Integer> al1 =new ArrayList<Integer>();
		for(int i=0;i<=8;i++) {
			al1.add(i);
		}
		
		// Get the iterator
	    Iterator<Integer> it = al1.iterator();

	    while(it.hasNext()) {
	    	Integer i = it.next();
	    	System.out.println(i);
	    	if(i%2 != 0) {
	    		it.remove();
	    	}
	    }
	    System.out.println(al1);
	    
	    //Change the arraylist
	    
	    ArrayList<String> languages = new ArrayList<String>();
	    languages.add("java");
	    languages.add("c++");
	    languages.add("c");
	    languages.add("python");
	    System.out.println(languages);
	    languages.set(2, "javascript");
	    System.out.println(languages);
	    languages.remove(3);
	    
	    /*
	     * for each loop
	     */
	    
	    /*
	     * for(datatype item:array/collection){
	     * ...
	     * }
	     */
	    //for loop
	    for(int i=0;i<languages.size();i++) {
	    	languages.get(i);
	    }
	    //for each loop
	    for(String l:languages) {
	    	System.out.println(l);
	    }
	    
	    
	    
	}

}
