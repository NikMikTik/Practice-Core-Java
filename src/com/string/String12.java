package com.string;

import java.util.Scanner;

public class String12 {
/*
	Enter Sentence
	Ashish Yadav Abhishek Rajput Sunil Pundir
	ridnuP tupjaR vadaY Ashish Abhishek Sunil 

	Ashish Yadav Abhishek Rajput Sunil Pundir Prem
	merP linuS kehsihbA hsihsA Yadav Rajput Pundir

*/
	
	public static String rev(String word) {
		String str = "";
		char[] abc = word.toCharArray();
		int i = abc.length - 1;
		for (int j = i; j >= 0; j--) {
			str += abc[j];
		}
		return str;

	}

	public static void main(String[] args) {
		System.out.println("Enter Sentence");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		String[] words = sentence.split(" ");
		String[] sstre = new String[words.length];

		if ((words.length) % 2 == 0) {
			for (int i = words.length - 1,k=words.length-1 , j = 0; i >= 0; i--) {
				if ((i + 1) % 2 == 0) {
					String abc = rev(words[i]);
					sstre[j] = abc;
					j++;
				} else {
					sstre[k] = words[i];
					k--;
				}
			}
		} else {
		
			
			for (int i = words.length - 1,k=words.length-1 , j = 0; i >= 0; i--) {
				if ((i) % 2 == 0) {
					String abc = rev(words[i]);
					sstre[j] = abc;
					j++;
				} else {
					sstre[k] = words[i];
					k--;
				}
			}
			
		}

		for (String string : sstre) {
			System.out.print(string+" ");

		}
	}
}
