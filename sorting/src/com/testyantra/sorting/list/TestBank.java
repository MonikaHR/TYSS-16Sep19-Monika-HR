package com.testyantra.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TestBank {
	public static void main(String[] args) {

		SortByNamebank sb = new SortByNamebank();
		SortByPincodeBank sb1 = new SortByPincodeBank();
		SortByMicrBank sb2 = new SortByMicrBank();
		TreeSet<Bank> ts = new TreeSet<Bank>(sb2);
		Bank b1 = new Bank("HDFC", 87848, 87777);
		Bank b2 = new Bank("SBI", 45657, 44748);
		Bank b3 = new Bank("CITI", 55677, 36373);
		Bank b4 = new Bank("ICICI", 67856, 78659);

		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);

		System.out.println("==============using Iterator");
		Iterator<Bank> it = ts.iterator();
		while(it.hasNext()) {
			Bank bb = it.next();
			System.out.println("Name is "+bb.name);
			System.out.println("Pincode is "+bb.pincode);
			System.out.println("MICR is "+bb.micr);
			System.out.println("==========================");
		}

	}
}
