package com.TechForum.Strings;

public class stringBufferrrs {
	public static void main(String[] args) {

		String s1 = "hello";
		String s = s1;
		s1 = s1.concat(" guys");
		
		// s1 = s1.concat
		System.out.println(s1);
		System.out.println(s1.replaceAll(s1, "hello world"));
		
		//String is immutable
		String str = "java";
		str.concat(" rules");
		System.out.println("str refers to "+str);
		
		StringBuffer sb = new StringBuffer("study");
		sb.append(" java");
		sb.append(123);
		sb.insert(4,  "Harry");
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer("Kavin");
		//sb2.reverse();
		//sb2.replace(6, 12, "world");
		System.out.println(sb2);
		
		StringBuffer sb3 = new StringBuffer("study");
		System.out.println(sb3.length());
		System.out.println(sb3.capacity()); //Print 16 as default value

		StringBuilder sbuilder = new StringBuilder();
	}
}
