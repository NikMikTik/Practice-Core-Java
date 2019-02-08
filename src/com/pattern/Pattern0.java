package com.pattern;

import java.util.*;

public class Pattern0 {

/*	Enter n
	5
	*****
	*****
	*****
	*****
	*****
*/
	public static void main(String[] args) {
		int n,i,j=0;
		System.out.println("Enter n");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			for(j=n-i; j>0;j--)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
