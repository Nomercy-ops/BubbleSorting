package com.bridgelabz;

import java.util.Scanner;

public class Strings {
 static String str;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to convert: ");
		 str = sc.next();
		System.out.println("Choose from the following: ");
		System.out.println("1. Uppercase 2. Lowercase");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			upperCase();
		break;
		case 2: 
			lowerCase();
		break;
		default:
			System.out.println("Enter a correct option..");
			break;
		}
	}
		

	private static void lowerCase() {
		System.out.println("The uppercase conversion of string is : " + str.toLowerCase());
		
	}

	private static void upperCase() {
		System.out.println("The uppercase conversion of string is : " + str.toUpperCase());
		
	}
}

