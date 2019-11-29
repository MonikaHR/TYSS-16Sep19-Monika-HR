package com.testyantra.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestLaptop {
	public static void main(String[] args) {

		LinkedList<Laptop> ll = new LinkedList<Laptop>();
		Laptop lp1 = new Laptop(20000, 4, "HP");
		Laptop lp2 = new Laptop(30000, 6, "Dell");
		Laptop lp3 = new Laptop(35000, 12, "Mac");
		Laptop lp4 = new Laptop(40000, 8, "Asus");

		ll.add(lp1);
		ll.add(lp2);
		ll.add(lp3);
		ll.add(lp4);
		ll.add(new Laptop(55000, 8, "acer"));
		System.out.println("Before Sorting--------------");
		displayLaptopDetails(ll);
		System.out.println("After sorting----------------");
		Collections.sort(ll);
		displayLaptopDetails(ll);

	}
	static void displayLaptopDetails(LinkedList<Laptop> l) {
		Iterator<Laptop> it = l.iterator();
		while(it.hasNext()) {
			Laptop l1 = it.next();
			System.out.println("Brand is "+l1.name);
			System.out.println("price is "+l1.price);
			System.out.println("Raam is "+l1.ram);

		}

	}
}
