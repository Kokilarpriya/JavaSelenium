package com.TechForum.JavaPrograms;

public class TestObj {
	public static void main(String[] args) {
		Object o = new Object() {
		public boolean equals(Object obj) {
		return TRUE;
		}}
		System.out.println(o.equals("Fred"));
		}}
}
