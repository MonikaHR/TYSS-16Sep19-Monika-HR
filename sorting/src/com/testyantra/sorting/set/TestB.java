package com.testyantra.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {
public static void main(String[] args) {
	
	HashSet<String> hs = new HashSet<String>();
	hs.add("monu");
	hs.add("megha");
	hs.add("roopa");
	hs.add("kavya");
	hs.add("manu");
	
	System.out.println("==========using for each=========");
	for(String s : hs) {
		System.out.println(s);
	}
	
	System.out.println("===using Iterator===========");
	Iterator<String> it = hs.iterator();
	while(it.hasNext()) {
		String ss = it.next();
		System.out.println(ss);
	}
}
}
