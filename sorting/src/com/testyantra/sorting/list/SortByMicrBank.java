package com.testyantra.sorting.list;

import java.util.Comparator;

public class SortByMicrBank implements Comparator<Bank>{
	
	@Override
	public int compare(Bank m1, Bank m2) {
		Long l = m1.micr;
		Long j = m2.micr;
		return l.compareTo(j);
	}

}
