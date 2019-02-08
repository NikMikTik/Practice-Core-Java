package com.string;

import java.util.Scanner;

public class String01 {

	public static void main(String[] args) {

		String A;
		String B = "";

		int n;
		boolean flag = false;
		String value = null;
		Scanner scanner = new Scanner(System.in);
		A = scanner.nextLine();
		scanner.close();
		n = A.length();

		for (int i = n - 1; i >= 0; i--) {
			B = B + A.charAt(i);
		}

		System.out.println(A);
		System.out.println(B);

		for (int j = 1; j < n - 1; j++) {
			if (A.charAt(j) - A.charAt(j - 1) != B.charAt(j) - B.charAt(j - 1)) {
				flag = false;
				break;
			} else {
				flag = true;

			}

		}
		if (flag == false) {
			value = "Invalid";
		} else {
			value = "Valid";
		}
		System.out.println(value);

	}
}
