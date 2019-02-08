package com.sort;

import java.util.Scanner;

public class Bubble {

	void func(int[] arr)
	{
		for (int i : arr) {
		}
	}
	
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] arr=new int[n];
		for (int i : arr) {
			arr[i]=sc.nextInt();
		}
		Bubble bubble=new Bubble();
		bubble.func(arr);
	}
	
}
