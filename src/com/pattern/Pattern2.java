package com.pattern;

import java.util.*;
public class Pattern2 {

/*
	Enter n
	5
	    *
	   **
	  ***
	 ****
	*****
*/
	
	public static void main(String[] args){
		int n,i,j=0;
		System.out.println("Enter n");
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i+j<n-1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}
	}
}
