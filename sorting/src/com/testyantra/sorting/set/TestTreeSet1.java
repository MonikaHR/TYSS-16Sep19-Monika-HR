package com.testyantra.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet1 {
	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>();
		ts.add("roopa");
		ts.add("divya");
		ts.add("megha");
		ts.add("lavanya");


		System.out.println("======using for each=====");
		for(String s : ts) {
			System.out.println(s);
		}

		System.out.println("=========using Iterator==========");
		Iterator<String> it = ts.iterator();
		while(it.hasNext()) {
			String ss = it.next();
			System.out.println(ss);
		}
	}
}
