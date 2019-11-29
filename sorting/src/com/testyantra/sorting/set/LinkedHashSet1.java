package com.testyantra.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
public static void main(String[] args) {
	
	LinkedHashSet<Double> ll = new LinkedHashSet<Double>();
	ll.add(22.3);
	ll.add(44.7);
	ll.add(77.8);
	ll.add(99.0);
	ll.add(77.8);
	
	System.out.println("=========using for each=======");
	for(Double d : ll) {
		System.out.println(d);
	}
	
	System.out.println("===========using Iterator");
	Iterator<Double> it = ll.iterator();
	while(it.hasNext()) {
		Double d = it.next();
		System.out.println(d);
	}
}
}
