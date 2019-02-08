package com.arrays;

import java.util.HashSet;
import java.util.Scanner;

public class Array01 {

	
/*	Enter n
	9
	Enter Array
	1
	2
	5
	7
	10
	19
	21
	32
	50
	Triple set:
	7 
	21 
*/
	
	public static void main(String[] args) {
HashSet<Integer> set=new HashSet<>();
		System.out.println("Enter n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter Array");
		for (int k=0;k<n;k++) {
			arr[k]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(i==j)
				{continue;}
				else
				{
					set.add(arr[i]+arr[j]);
				}
				
					
			}
		}
		System.out.println("Triple set:");
		for (int i : arr) {
			if(set.contains(i))
			{
				System.out.println(i+" ");
			}
		}
		
	}

}
