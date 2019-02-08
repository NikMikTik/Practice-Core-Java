package com.collections;

import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Collections03 {

/*	---->3---->2---->0
	Hit---3
	Miss---7
*/
	
	static Deque<Integer> dq;
	static HashSet<Integer> map;
	static int csize;
	static int miss;
	static int hit;

	public Collections03(int i) {
		dq = new LinkedList<>();
		map = new HashSet<>();
		csize = i;
	}

	public static void main(String[] args) {

		 LinkedList list = new LinkedList(); 
		 
		Collections03 cc = new Collections03(3);
		cc.refer(0);
		cc.refer(1);
		cc.refer(2);
		cc.refer(3);
		cc.refer(2);
		cc.refer(1);
		cc.refer(0);
		cc.refer(3);
		cc.refer(2);
		cc.refer(3);

		cc.display();

	}

	private void display() {
		Iterator<Integer> itr = dq.iterator();
		while (itr.hasNext()) {
			System.out.print("---->" + itr.next());
		}
		System.out.println("\nHit---"+hit);
		System.out.println("Miss---"+miss);
	}

	private void refer(int i) {
		if (!map.contains(i)) {
			miss++;
			if (dq.size() == csize) {
				int last = dq.removeLast();
				map.remove(last);
			}
		} else {
			hit++;
			dq.remove(i);
		}
		dq.addFirst(i);
		map.add(i);
		System.out.println("---------------"+dq+"--------------");
	}

}
