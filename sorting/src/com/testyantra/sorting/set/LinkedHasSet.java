package com.testyantra.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHasSet {
	public static void main(String[] args) {

		LinkedHashSet ls = new LinkedHashSet();
		ls.add(34);
		ls.add("nikitha");
		ls.add(89.9);
		ls.add(34);
		ls.add("bhavya");
		ls.add(34);
		ls.add(null);
		ls.add(null);

		System.out.println("============using for each=============");
		for(Object o : ls) {
			System.out.println(o);
		}

		System.out.println("=========using Iterator============");
		Iterator li = ls.iterator();
		while(li.hasNext()) {
			Object ob = li.next();
			System.out.println(ob);
		}
	}
}
