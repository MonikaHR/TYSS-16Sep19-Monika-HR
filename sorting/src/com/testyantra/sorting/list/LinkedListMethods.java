package com.testyantra.sorting.list;

import java.util.LinkedList;

public class LinkedListMethods {
	public static void main(String[] args) {

		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(12);
		l.add(22);
		l.add(78);
		l.add(24);

		Integer peekElement = l.peek();
		System.out.println("peek Element "+peekElement);

		Integer peekFirstElement = l.peekFirst();
		System.out.println("peek first elemnt "+peekFirstElement);

		Integer peekLastElement = l.peekLast();
		System.out.println("peek last element "+peekLastElement);
		System.out.println("After Peek -------->"+l);

		System.out.println("===================================");

		Integer pollElement = l.poll();
		System.out.println("Poll Element "+pollElement);

		Integer pollFirstElement = l.pollFirst();
		System.out.println("Poll First element "+pollFirstElement);

		Integer pollLastElement = l.pollLast();
		System.out.println("poll Last Element "+pollLastElement);
		System.out.println("After poll ------------>> "+l);

		l.push(12);
		System.out.println("After Push "+l);
		Integer p = l.pop();
		System.out.println(p);
		System.out.println("After Pop ------->> "+l);

	}
}
