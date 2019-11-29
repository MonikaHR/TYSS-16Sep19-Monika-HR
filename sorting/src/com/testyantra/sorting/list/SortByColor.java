package com.testyantra.sorting.list;

import java.util.Comparator;

public class SortByColor implements Comparator<Marker>{

	@Override
	public int compare(Marker o1, Marker o2) {
		String l = o1.color.toLowerCase();
		String m = o2.color.toLowerCase();
		return l.compareTo(m);
	}
}
