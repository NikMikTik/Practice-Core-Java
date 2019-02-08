package com.simple;

import java.util.Scanner;

public class Simple1 {

/*
	Enter T
	2
	Enter B
	5
	Enter LS
	13
	Maximum RS: 13.92838827718412
	Minimum RS:12.0
	Enter B
	5
	Enter LS
	12
	Maximum RS: 13.0
	Minimum RS:10.908712114635714
*/
	
	public static void main(String [] args){
		
		int T;int B,LS=0;
		System.out.println("Enter T");
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		
		for(int i=0;i<T;i++){
			
			System.out.println("Enter B");
			B=sc.nextInt();
			System.out.println("Enter LS");
			LS=sc.nextInt();
			
			System.out.println("Maximum RS: "+Math.sqrt(Math.pow(B, 2)+Math.pow(LS, 2)));
			System.out.println("Minimum RS:"+Math.sqrt((Math.pow(LS, 2)-Math.pow(B, 2))));
		}
	}
}
