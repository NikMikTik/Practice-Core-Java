package com.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class File02 {

	public static void main(String[] args) throws IOException {

		HashMap<String, Integer> hash = new HashMap<>();
		HashMap<String, Integer> newhash = new HashMap<>();
		File file = new File("D:\\abc.txt");
		/* FileWriter writer=new FileWriter(file); */
		/*
		 * writer.
		 * write("Welcome to the world of Geeks This portal has been created to provide well written well thought "
		 * +
		 * "and well explained solutions for selected questions If you like Geeks for Geeks and would like to contribute "
		 * +
		 * "here is your chance You can write article and mail your article to contribute at geeksforgeeks org See your article "
		 * +
		 * "appearing on the Geeks for Geeks main page and help thousands of other Geeks"
		 * );
		 */

		Scanner scan = new Scanner(file);
		while (scan.hasNext()) {
			String str = scan.next();
			str = str.toLowerCase();
			if (!hash.containsKey(str)) {
				hash.put(str, 1);
			} else {
				int val = hash.get(str);
				val = val + 1;
				hash.put(str, val);
			}
		}

		System.out.println("Enter k frequency");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();

		File02 fii = new File02();
		newhash = fii.sortByValue(hash);

		for (String string : newhash.keySet()) {

			if (k > 0)
				System.out.println(string + " " + hash.get(string));
			else {
				break;
			}
			k--;
		}
		System.out.println(newhash);

	}

	private HashMap<String, Integer> sortByValue(HashMap<String, Integer> unsortMap) {

		// 1. Convert Map to List of Map
		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(unsortMap.entrySet());

		// 2. Sort list with Collections.sort(), provide a custom Comparator
		// Try switch the o1 o2 position for a different order
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		Collections.reverse(list);
		// 3. Loop the sorted list and put it into a new insertion order Map
		// LinkedHashMap
		HashMap<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		/*
		 * //classic iterator example for (Iterator<Map.Entry<String, Integer>>
		 * it = list.iterator(); it.hasNext(); ) { Map.Entry<String, Integer>
		 * entry = it.next(); sortedMap.put(entry.getKey(), entry.getValue()); }
		 */

		return sortedMap;
	}

}
