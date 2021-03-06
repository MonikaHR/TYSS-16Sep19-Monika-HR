package com.testyantra.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestB {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(30);
		al.add(23);
		al.add(5);
		al.add(12);
		al.add(4);
		al.add(24);

		List<Integer> l =al.stream().map(i -> i * 3).collect(Collectors.toList());

		for(Integer i : l) {
			System.out.println(i);                    // to modify data we always use map
		}

	}		
}
