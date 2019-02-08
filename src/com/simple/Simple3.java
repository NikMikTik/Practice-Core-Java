package com.simple;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Simple3 {

	/* package whatever //do not write package name here */

	public static void main(String[] args) {
		// code
		int T;
		System.out.println("Enter Test Cases No.");
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		while (T-- > 0) {
			int sum = 0;
			System.out.println("Enter N and S");
			int N = Integer.parseInt(sc.next());
			int S = Integer.parseInt(sc.next());
			Scanner sc2 = new Scanner(System.in);
			int[] arr = new int[N];
			String Num = sc2.nextLine();
			String[] Nuum = Num.split(" ");
			int i = 0;
			for (String nn : Nuum) {

				arr[i] = Integer.parseInt(nn);
				i++;

			}
			int f=0;
			for (int k = 0; k < N - 1; k++) {
				sum=0;
				for (int j = k; j < N ; j++) {
					sum += arr[j];
					if (sum == S) {
						System.out.println(k+1 + " " + (j+1));f=1;
						break;
					}
					
				}
			}
			if (f == 0 ) {
				System.out.println("-1");
			}
		}
	}
}
