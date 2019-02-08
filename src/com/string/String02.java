package com.string;

import java.util.Scanner;

public class String02 {

/*	
	Enter T
	2
	Enter n bulbs
	1
	1
	Enter n bulbs
	2
	3
*/
	
	public static void main(String[] args) {

		Scanner scc = new Scanner(System.in);
		System.out.println("Enter T");
		int t = scc.nextInt();

		for (int i = 0; i < t; i++) {
			System.out.println("Enter n bulbs");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();

			double patterns;
			patterns = Math.pow(2, n) - 1;

			System.out.println((int) patterns);
		}
	}
}
