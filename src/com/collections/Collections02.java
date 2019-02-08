package com.collections;

/* We can use Java inbuilt Deque as a double 
ended queue to store the cache keys, with 
the descending time of reference from front 
to back and a set container to check presence 
of a key. But remove a key from the Deque using 
remove() , it takes O(N) time. This can be 
optimized by storing a reference (iterator) to 
each key in a hash map. */
import java.util.Deque; 
import java.util.HashSet; 
import java.util.LinkedList; 
import java.util.Iterator; 
 class Collections02 { 
	// store keys of cache 
	static Deque<Integer> dq; 
	// store references of key in cache 
	static HashSet<Integer> map; 
	//maximum capacity of cache 
	static int csize; 
	
	Collections02(int n) 
	{ 
		dq=new LinkedList<>(); 
		map=new HashSet<>(); 
		csize=n; 
	} 
	
	/* Refers key x with in the LRU cache */
	public void refer(int x) 
	{ 
		if(!map.contains(x)) 
		{ 
			if(dq.size()==csize) 
			{ 
				int last=dq.removeLast(); 
				map.remove(last); 
			} 
		} 
		else
		{ 
			dq.remove(x); 
		} 
		dq.push(x); 
		map.add(x); 
	} 
	
	// display contents of cache 
	public void display() 
	{ 
		Iterator<Integer> itr = dq.iterator(); 
		while(itr.hasNext()) 
		{ 
			System.out.print(itr.next()+" "); 
		} 
	} 
	
	
	public static void main(String[] args) { 
		Collections02 ca=new Collections02(4); 
		ca.refer(1); 
		ca.refer(2); 
		ca.refer(3); 
		ca.refer(1); 
		ca.refer(3); 
		ca.refer(4); 
		ca.refer(5); 
		ca.refer(2); 

		ca.display();	 
	} 
} 
//This code is contributed by Gaurav Tiwari 
