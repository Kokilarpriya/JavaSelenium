package com.TechForum.JavaPrograms;

public class ReverseString {

	public ReverseString() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "ABCD";
		String nstr="";
        char ch;
       
      System.out.print("Original word: ");
      System.out.println("ABCD"); //Example word
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ nstr);
      reverse();
    }

	static void reverse() {
		String input = "ABC for BCD";
		 
        StringBuilder input1 = new StringBuilder();
 
        // append a string into StringBuilder input1
        input1.append(input);
 
        // reverse StringBuilder input1
        input1.reverse();
 
        // print reversed String
        System.out.println(input1);
	}
}
