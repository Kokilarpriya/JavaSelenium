package com.TechForum.controlStatements;

public class StarTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StarTriangle().drawTriangle();
		new StarTriangle().drawReverseTriangle();
	}

	public void drawTriangle() {
		int i, j, row = 5;
		// Outer loop work for rows
		for (i = 0; i < row; i++) {
			// inner loop work for space
			for (j = row - i; j >= 1; j--) {
				// prints space between two stars
				System.out.print(" ");
			}
			// inner loop for columns
			for (j = 0; j <= i; j++) {
				// prints star
				System.out.print("* ");
			}
			System.out.println();
		}

	}
	public void drawReverseTriangle() {
		int i, j, row = 5;
		// Outer loop work for rows
		for (i = row; i >0; i--) {
			// inner loop work for space
			for (j = row-i+1 ; j >= 1; j--) {
				// prints space between two stars
				System.out.print(" ");
			}
			// inner loop for columns
			for (j = i; j >=1; j--) {
				// prints star
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}
