package com.TechForum.Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingExample {

	public static void main(String[] args){
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter two integer numbers");
			try {
			FileInputStream fi = new FileInputStream(new File("sample.txt"));
			}
			catch(IOException ie) {
				System.out.println("ie exception");
			}
			try {
				
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				System.out.println(num1+"/"+num2+"="+ (num1/num2));
			}
			catch(ArithmeticException e) {
				System.out.println("Arithmetic Exception handled");
			}
			catch(InputMismatchException i) {

				System.out.println("Input mismatch exception.");
			}
			finally {
				
			}
	}

}
