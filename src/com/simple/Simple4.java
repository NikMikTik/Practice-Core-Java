package com.simple;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Simple4 {

	public HashMap<Integer, Integer> factor(int i) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int j = 2;
		while (i > 1) {
			if (i % j == 0) {
				if (!map.containsKey(j)) {
					map.put(j, 1);
				} else {
					int val = map.get(j);
					val = val + 1;

					map.put(j, val);

				}
				i = i / j;

			} else {
				j++;

			}

		}
		return map;

	}

	public HashSet<Integer> factors(int i) {
		HashSet<Integer> set = new HashSet<>();

		int j = 2;
		while (i > 1) {
			if (i % j == 0) {
				if (!set.contains(j))
					set.add(j);
				i = i / j;
			} else {
				j++;
			}
		}
		return set;

	}

	public static void main(String[] args) {
		int lcm = 1;
		HashMap<Integer, Integer> hash1 = new HashMap<>();
		HashMap<Integer, Integer> hash2 = new HashMap<>();
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		System.out.println("Enter two numbers");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Simple4 sim = new Simple4();
		hash1 = sim.factor(n);
		set1 = sim.factors(n);
		hash2 = sim.factor(m);
		set2 = sim.factors(m);

		System.out.println(hash1);
		System.out.println(hash2);
		System.out.println(set1);
		System.out.println(set2);

		HashMap<Integer, Integer> hh = new HashMap<>();

		for (Integer integer1 : set1) {
			int count = 0;

			if (set2.contains(integer1)) {
				if (hash1.get(integer1) > hash2.get(integer1)) {
					count = hash1.get(integer1);
					hh.put(integer1, count);
				} else {
					count = hash2.get(integer1);
					hh.put(integer1, count);

				}
			} else {
				hh.put(integer1, hash1.get(integer1));
			}

		}

		for (Integer integer4 : set2) {

			if (!hh.containsKey(integer4)) {
				hh.put(integer4, hash2.get(integer4));
			}

		}

		System.out.println(hh);

		for (Integer integer3 : hh.keySet()) {

			int num = hh.get(integer3);
			while (num >= 1) {
				lcm = integer3 * lcm;
				num--;
				System.out.println(lcm);
			}

		}
		System.out.println("===============------------=============" + lcm);

	}

}
