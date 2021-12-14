package com.TechForum.Strings;
import java.util.StringTokenizer;
public class StringTokenizer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("This is ABC");
		while (st.hasMoreTokens()) {  
	         System.out.println(st.nextToken());  
	     }  
				
	}

}
