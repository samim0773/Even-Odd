package com.bridgelabz;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number=scanner.nextInt();
		if(number % 2 == 0) {
			System.err.println("Given number is even");
		}
		else {
			System.out.println("Given number is odd");
		}
	}

}
