package com.string;

import java.util.HashMap;
import java.util.Scanner;

public class String14 {

	public static void main(String[] args) {
		String abc = "";
		System.out.println("Enter sentence");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		HashMap<String, Integer> hash = new HashMap<>();
		char[] a = sentence.toCharArray();
		String str;
		for (char c : a) {
			str = Character.toString(c);
			if (str.equals("(") || str.equals(")") || str.equals("{") || str.equals("}") || str.equals("[")
					|| str.equals("]"))
				if (hash.containsKey(str)) {
					int val = hash.get(str);
					val = val + 1;
					hash.put(str, val);
				} else {
					hash.put(str, 1);
				}
		}
		boolean flag = false;

		if (hash.containsKey("(") || hash.containsKey(")")) {
			if (hash.get("(") == hash.get(")")) {
				flag = true;
			} else
				flag = false;
		}
		if (hash.containsKey("{") || hash.containsKey("}")) {
			if (hash.get("{") == hash.get("}")) {
				flag = true;
			} else
				flag = false;
		}
		if (hash.containsKey("[") || hash.containsKey("]")) {
			if (hash.get("[") == hash.get("]")) {
				flag = true;
			} else
				flag = false;
		}

		if (flag == false) {
			System.out.println("Unbalanced");

		} else {
			System.out.println("Balanced");
		}

	}

}
