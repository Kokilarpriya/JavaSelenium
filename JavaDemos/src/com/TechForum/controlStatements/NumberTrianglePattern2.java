package com.TechForum.controlStatements;

public class NumberTrianglePattern2 {

	public static void main(String[] args) {
		// Draw number triangle
		new NumberTrianglePattern2().drawTriangle();
	}

	public void drawTriangle() {
		int counter;
		for (int j = 1; j <= 10; j++) {
			System.out.print(j);

			counter = 0;
			counter = counter + j + 1;
			switch (counter) {
			// Case statements.
			case 1:
				System.out.println();

				break;
			case 2:
				System.out.println();
				break;
			case 4:
				System.out.println();
				break;
			case 7:
				System.out.println();
				break;
			default:
				break;
			}
		}
	}

}
