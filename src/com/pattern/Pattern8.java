package com.pattern;

import java.util.Scanner;

public class Pattern8 {

/*
 	Enter Height
	5
	    1 
	   2 3  
	  4 5 6   
	 7 8 9 10    
	11 12 13 14 15     

 */

	public static void main(String[] args) {
		int n, i, j, k = 0;
		int a = 1;
		System.out.println("Enter Height");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (i + j == n - 1) {

					for (k = 1; k <= i + 1; k++) {
						System.out.print(a + " ");
						a++;
					}
				} else {
					System.out.print(" ");

				}
			}
			System.out.println();
		}
	}
}