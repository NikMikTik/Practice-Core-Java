package com.pattern;

import java.util.Scanner;

public class Pattern7 {

/*	
	Enter Height
	5
	    1 
	   2 2  
	  3 3 3   
	 4 4 4 4    
	5 5 5 5 5 
*/
	
	public static void main(String[] args) {
		int n, i, j, k = 0;
		System.out.println("Enter n");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (i = 0; i<n; i++) {
			for (j = 0; j < n; j++) {
				if(i+j==n-1){
				
				for (k = 1; k <=i+1; k++) {
					System.out.print(i+1+" ");
				}
			}
				else{
					System.out.print(" ");

				}
			}
			System.out.println();
		}
	}
}