package com.collections;

import java.util.LinkedHashMap;

public class Collections01<K, V> extends LinkedHashMap<K, V> {

	private static int size;

	private static Collections01<Integer, String> newInstance(int size) {
		return new Collections01<Integer, String>(size);
	}

	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
		return size() > size;
	}

	public Collections01(int size) {
		// super();
		this.size = size;
	}

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {

		Collections01<Integer, String> lrumap = Collections01.newInstance(3);
		lrumap.put(0, "Zero");
		System.out.println(lrumap);
		lrumap.put(1, "First");
		System.out.println(lrumap);
		lrumap.put(2, "Second");
		System.out.println(lrumap);
		lrumap.put(3, "Third");
		System.out.println(lrumap);
		lrumap.put(2, "Second");
		System.out.println(lrumap);
		lrumap.put(1, "First");
		System.out.println(lrumap);
		lrumap.put(0, "Zero");
		System.out.println(lrumap);
		lrumap.put(3, "Third");
		System.out.println(lrumap);
		lrumap.put(2, "Second");
		System.out.println(lrumap);
		lrumap.put(3, "Third");
		System.out.println(lrumap);
	}

}
