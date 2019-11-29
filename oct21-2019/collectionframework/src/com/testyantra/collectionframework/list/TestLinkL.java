package com.testyantra.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestLinkL {
	public static void main(String[] args) {

		LinkedList li = new LinkedList();
		li.add(12);
		li.add(4.5);
		li.add("monu");
		li.add(true);
		li.add(null);
		

		System.out.println("==========for loop==========");
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}

		System.out.println("============for each================");
		for(Object obj : li) {
			System.out.println(obj);
		}

		System.out.println("==========Iterator===========");
		Iterator i = li.iterator();
		while(i.hasNext()) {
			Object o1 = i.next();
			System.out.println(o1);
		}

		System.out.println("============List Iterator forward==========");
		ListIterator ii = li.listIterator();
	
		while(ii.hasNext()) {
			Object o2 = ii.next();
			System.out.println(o2);
		}
		
		System.out.println("===========ListIterator Backward==========");
		while(ii.hasPrevious()) {
			Object o3 = ii.previous();
			System.out.println(o3);
		}
	}
}
