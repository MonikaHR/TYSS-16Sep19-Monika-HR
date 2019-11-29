package com.testyantra.sorting.queve;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueve {
	public static void main(String[] args) {

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(12);
		pq.add(24);
		//	pq.add("hellow");
		//	pq.add(null);
		pq.add(66);
		pq.add(12);
		pq.offer(45);                 //same as add method

		System.out.println("Before poll "+pq);
		System.out.println("======using Iterator============");
		Iterator<Integer> it = pq.iterator();
		while(it.hasNext()) {
			System.out.println(pq.poll());
		}
		System.out.println("After poll "+pq);
	}
}
