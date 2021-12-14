package com.TechForum.Strings;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class StringTokenizerHomework {

	public static void main(String[] args) throws IOException {
		// File path is passed as parameter
       /* File file = new File("C:\\Java Files\\testjava.txt");
     // Creating an object of BufferedReader class
        BufferedReader br = new BufferedReader(new FileReader(file));
 
        // Declaring a string variable
        String a=".";
        String b="";
        // Condition holds true till
        // there is character in a string
        while ((b = br.readLine()) != null) {
        	b=br.readLine();
            // Print the string
            System.out.println(b);
        }*/
    
		// TODO Auto-generated method stub
        String a=".";
		String b = "Generally, String is a sequence of characters. But in Java, string is an object that represents a sequence of characters. The Java String is immutable which means it cannot be changed. Whenever we change any string, a new instance is created. For mutable strings, you can use StringBuffer and StringBuilder classes.";
		StringTokenizer st = new StringTokenizer(b,a);
		int count = st.countTokens();
		for(int i=0;i< count; i++) {
			//System.out.println("Sentence["+i+"]: "+st.nextToken());
			String sentence = st.nextToken();
			int k = i+1;// to print sentence from 1 instead of 0
			System.out.println("sentence"+k+":"+sentence);
			StringTokenizer st1 = new StringTokenizer(sentence);
			int count1 = st1.countTokens();
			for(int j=1;j< count1; j++) {
				String word = st1.nextToken();
				if( j==2) {
					String secondWord = word;
					System.out.println(secondWord);
					char[] ch = secondWord.toCharArray();
					System.out.println(ch[1]);
				}
				
			}
			
		}
		
	}

}
