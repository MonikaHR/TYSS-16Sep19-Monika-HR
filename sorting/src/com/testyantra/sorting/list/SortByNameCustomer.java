package com.testyantra.sorting.list;

import java.util.Comparator;

public class SortByNameCustomer implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {

		String s1 = o1.name.toLowerCase();
		String s2 = o2.name.toLowerCase();
		return s1.compareTo(s2);
	}
}
