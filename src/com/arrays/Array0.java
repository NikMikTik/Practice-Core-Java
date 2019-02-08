package com.arrays;

import java.util.Scanner;

public class Array0 {

/*	
	Enter n
	5
	1
	2
	3
	4
	5
	Output:--14,13,12,11,10

*/
	
	public static void main(String[] args) {
		int n;
		System.out.println("Enter n");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		String arr = "";

		int[] a = new int[n];

		Scanner scc=new Scanner(System.in);
		for(int k=0;k<n;k++)
			a[k]=scc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int sum = 0;

			for (int j = 0; j < n; j++) {
				if (i != j) {
					sum += a[j];
				}
			}
			if (i < n - 1)
				arr += sum + ",";
			else
				arr += sum;
		}

		System.out.println("Output:--"+arr);
	}
}
