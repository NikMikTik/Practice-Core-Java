package com.simple;

import java.util.Scanner;

/*
 * OUTPUT
Enter test cases and Enter a number(s) less than 1000000
3 562 804 367
565 808 373
*/


public class Simple6 {

	public static void main(String[] args) {
		System.out.println("Enter test cases and Enter a number(s) less than 1000000");
		Scanner sc =new Scanner(System.in);
		String j;
		j=sc.nextLine();
		String[] a=j.split(" ");
		int t=Integer.parseInt(a[0]);
		int n;
		Simple6 sim=new Simple6();
		for(int l=1;l<=t;l++)
		{
			n=Integer.parseInt(a[l]);
			int k=sim.palindrome(n);
			System.out.print(k+" ");


		}

	}

	private int palindrome(int n) {
	boolean flag=true;
	int i=n+1;
	while(flag)
	{
		if(check(i)==true)
		{
			flag=false;
		}
		else
		{
			i++;
		}
	}
		return i;
	}

	private boolean check(int i) {
		boolean val=false;
		int num=i;int rem,x=0;
		while(num!=0)
		{
			rem=num%10;
			x=x*10+rem;
			num/=10;
		}
		if(x==i)
		{val=true;}

		return val;
	}

}

