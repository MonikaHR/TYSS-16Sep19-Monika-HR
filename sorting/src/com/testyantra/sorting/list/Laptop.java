package com.testyantra.sorting.list;

public class Laptop implements Comparable<Laptop>{

	double price;
	int ram;
	String name;

	public Laptop(double price, int ram, String name) {
		super();
		this.price = price;
		this.ram = ram;
		this.name = name;
	}

	//	@Override
	//	public int compareTo(Laptop l) {
	//		Integer i = this.ram;
	//		Integer j = l.ram;
	//		return i.compareTo(j);
	//	}

	//	@Override
	//	public int compareTo(Laptop l) {
	//		Double i = this.price;
	//		Double j = l.price;
	//		return i.compareTo(j);
	//	}

	@Override
	public int compareTo(Laptop l) {
		String s = this.name.toLowerCase();
		String s1 = l.name.toLowerCase();
		return s.compareTo(s1);
	}

}
