package com.simple;

import java.util.Scanner;

public class Simple2 {

/*
	Enter T
	1
	Enter N and C
	3 69
	Enter A
	12 23 34
	12
	23
	34
	69
	Yes
*/
	
	public static void main(String[] args) {
		int T;
		System.out.println("Enter T");
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int sum = 0;
			System.out.println("Enter N and C");
			String N = sc.next();
			int n = Integer.parseInt(N);

			String C = sc.next();
			int c = Integer.parseInt(C);
			
			System.out.println("Enter A");
			Scanner scc = new Scanner(System.in);
			String[] A= scc.nextLine().split(" ",n );
			for (String string : A) {
				System.out.println(string);
				
			}
			

			for (int j = 0; j <n; j++) {
				sum += Integer.parseInt(A[j]);
				
			}
			
			System.out.println(sum);
			if (sum <= c) {
				System.out.println("Yes");
			} else
				System.out.println("No");

		}
	}

}
