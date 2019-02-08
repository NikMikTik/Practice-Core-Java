package com.arrays;
// Java program to demonstrate 
// Array.compare() method 

import java.util.Arrays; 

public class Main { 
	public static void main(String[] args) 
	{ 

		int[] arr = {1,2,3,4,5};
		 
		int[] ccc = new int[10];
		System.out.println((ccc[8]));
		System.arraycopy(arr,0, ccc, 1, 4);//5 is the length to copy
		System.out.println((ccc[8]));

		System.out.println(Arrays.toString(ccc));
		
		
		int[] copied = new int[10];
		 System.out.println(copied[8]);

		copied = Arrays.copyOf(arr, 5); //10 the the length of the new array
		 System.out.println(copied[8]);
			System.out.println(Arrays.toString(copied));

		 copied = Arrays.copyOf(arr, 3);
		System.out.println(Arrays.toString(copied));
		
	/*	int[] cc = new int[10];
		System.out.println(cc[8]);

		cc = Arrays.copyOfRange(arr,1, 5); //10 the the length of the new array
		System.out.println(cc[8]);
		System.out.println(Arrays.toString(cc));
		 
		cc = Arrays.copyOfRange(arr,2, 4);
		System.out.println(Arrays.toString(cc));*/
	} 
} 
