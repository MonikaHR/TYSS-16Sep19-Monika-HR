package com.testyantra.collectionframework.list;

import java.util.ArrayList;

public class TestlistIterator1 {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("shreya");

		Object o = al.get(0);
		String name = (String) o;

		name = name.toUpperCase();
		System.out.println(name);
	}
}
