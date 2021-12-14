package com.TechForum.Strings;

import java.util.StringTokenizer;
public class StringTokenizer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a=":";
		String b = "we : are : rangers";
		StringTokenizer st = new StringTokenizer(b,a);
		int count = st.countTokens();
		for(int i=0;i< count; i++) {
			System.out.println("Token["+i+"]: "+st.nextToken());
		}
	}

}
