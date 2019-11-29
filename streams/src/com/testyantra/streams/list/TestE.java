package com.testyantra.streams.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public abstract class TestE {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(30);
		al.add(23);
		al.add(5);
		al.add(12);
		al.add(4);
		al.add(24);

  List<Integer> l	= al.stream().sorted().collect(Collectors.toList());
  Iterator<Integer> it = l.iterator();
  while(it.hasNext()) {
	  Integer i = it.next();
	  System.out.println("Sorted---------------->");
	  System.out.println(i);
  }
	}
}
