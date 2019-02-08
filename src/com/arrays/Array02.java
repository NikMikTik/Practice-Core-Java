package com.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Array02 {

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
	5,2,7
	19,2,21
*/
	
	public static void main(String[] args) {
		HashMap<Integer,String> hash = new HashMap<>();
		System.out.println("Enter n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Array");
		for (int k = 0; k < n; k++) {
			arr[k] = sc.nextInt();
		}

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (i == j) {
					continue;
				} else {
					hash.put(arr[i]+arr[j],arr[i] +" "+arr[j]);
				}

			}
		}
		System.out.println("Triple set:");
		for (int i : arr) {
			if (hash.containsKey(i)) {
				String key=hash.get(i);
				String[] abc=key.split(" ");
				int a=Integer.parseInt(abc[0]);
				int b=Integer.parseInt(abc[1]);

				System.out.println(a +","+b+","+i);
			}
		}

	}

}
