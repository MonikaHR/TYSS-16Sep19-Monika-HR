package com.testyantra.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class TestMethods {
	public static void main(String[] args) {

		ArrayList<Double> al = new ArrayList<Double>();
		al.add(34.5);
		al.add(44.5);
		al.add(11.2);
		al.add(99.0); 
		al.add(34.5);
		al.add(null);
		al.add(null);

		System.out.println(al);
		al.add(2, 56.7);
		System.out.println("After add 2nd index "+al);
		al.remove(0);
		System.out.println("After removal of 0th index "+al);
		al.remove(null);                                                    //first matching element only removed
		System.out.println("After removing null "+al);
		Double val = al.get(4);
		System.out.println("Object at 4th index "+val);
		al.clear();
		System.out.println("After clear method "+al);
		boolean a = al.contains(54.6);
		System.out.println("After contains method "+a);
		al.set(2, 2.2);
		System.out.println("After replacing 2nd index "+al);

		List<Double> al1 = new ArrayList<>();
		al1.add(12.3);
		al1.add(2.3);
		al1.add(34.5);

		al.addAll(al1);
		System.out.println("After add al1 "+al);

		boolean contain = al.containsAll(al1);
		System.out.println("Contains all of al1 "+contain);

		boolean res = al.removeAll(al1);
		System.out.println("Removed all of al1 "+res);

	}
}
