package com.javatpoint;

import java.util.Scanner;

public class Fibonacci {

	//
	// void func(int n){
	// int[] a=new int[n];
	// a[0]=0;
	// a[1]=1;
	// for(int i=0;i<n-2;i++)
	// {
	// a[i+2]=a[i]+a[i+1];
	// }
	// for (int i : a) {
	// System.out.print(i+" ");
	// }
	// }

	static int a = 0;
	static int b = 1;
	int c;

	void func1(int n) {
		if (n > 0) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;

			func1(n - 1);
		}

	}

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		Fibonacci fib = new Fibonacci();
		System.out.print(a + " " +b+ " ");
		fib.func1(n - 2);
	}
}
