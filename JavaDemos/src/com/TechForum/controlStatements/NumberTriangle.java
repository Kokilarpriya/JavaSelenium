package com.TechForum.controlStatements;

public class NumberTriangle {

	public static void main(String[] args) {
		// Draw number triangle
		new NumberTriangle().drawTriangle(1,5);
		new NumberTriangle().drawTriangle(6,10);
		//new NumberTriangle().drawTriangle(1,10);
	}

	public void drawTriangle(int startNum, int endNum) {

		for (int i = startNum; i <= endNum; i++) {

			for (int j = startNum; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		//System.out.println();
		
		for (int i = endNum; i >=startNum; i--) {

			for (int j = startNum; j <= i ; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
		
		/*for (int i = endNum; i >= startNum; i--) {

			for (int j = i; j >= startNum; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();*/
		
	}

}
