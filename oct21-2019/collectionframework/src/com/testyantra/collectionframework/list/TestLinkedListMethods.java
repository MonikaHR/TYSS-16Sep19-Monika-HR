package com.testyantra.collectionframework.list;

import java.util.Collections;
import java.util.LinkedList;

public class TestLinkedListMethods {

	public static void main(String[] args) {

		LinkedList<Integer> l = new LinkedList<>();
		l.add(2);
		l.add(12);
		l.add(10);
		l.add(11);                                 //cant pass null
		l.add(3);
		
		System.out.println("Before sort "+l);
		Collections.sort(l);                                    //we should pass generic int means int only otherwise it wil  not perform sorting
		System.out.println("After sort "+l);
		
		Collections.reverse(l);
		System.out.println("After reverse "+l);
		
		Collections.shuffle(l);
		System.out.println("After shuffle "+l);


	}
}
