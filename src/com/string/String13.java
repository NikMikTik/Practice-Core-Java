package com.string;

import java.util.Scanner;

public class String13 {

	public static void main(String[] args) {

		System.out.println("Enter Sentence");
		Scanner sc=new Scanner(System.in);
		String sentence=sc.nextLine();
		String[] words=sentence.split(" ");
		int count=0;
		for (String string : words) {
			string.trim();
			if(!string.equals(""))
			{
				count++;
				System.out.println(string+" "+count);
			}
		}
		System.out.println("count: "+count);

	}

}
