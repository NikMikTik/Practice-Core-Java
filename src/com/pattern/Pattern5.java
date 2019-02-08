package com.pattern;

import java.util.Scanner;

public class Pattern5 {

/*	
	Enter n
	5
	    *
	   * *
	  * * *
	 * * * *
	* * * * *
	     
*/
	
	public static void main(String[] args) {
		int n, i, j, k = 0;
		System.out.println("Enter n");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if(i+j==n-1){
				System.out.print("*");
				for (k = i; k >0; k--) {
					System.out.print(" *");
				}
				break;
			}
				else{
					System.out.print(" ");

				}
			}
			System.out.println();
		}
	}
}