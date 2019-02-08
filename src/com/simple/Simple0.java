package com.simple;

import java.util.Scanner;

public class Simple0 {

	public static void main(String[] args){
		
		int T,n,count=0;
		System.out.println("Enter T");
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		for(int i=0;i<T;i++){
			System.out.println("Enter N");
			n=sc.nextInt();
			
			if(n%2==0)
				System.out.println("ALICE Wins");
			else
				System.out.println("BOB Wins");
		}
	}
}
