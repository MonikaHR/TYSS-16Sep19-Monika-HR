package com.testyantra.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {

		TreeSet ts = new TreeSet();
		ts.add(66);
		ts.add(55);
		ts.add(88);
//		ts.add(null);
//		ts.add(null);
		ts.add(55);

		System.out.println("==============using for each=========");
		for(Object o : ts) {
			System.out.println(o);
		}

		System.out.println("=========using Iterator======");
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			Object ob = it.next();
			System.out.println(ob);
		}
	}
}
