package com.testyantra.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(20);
		al.add(29.5);
		al.add(true);
		al.add("lavu");

		Iterator it =  al.iterator();
		Object o1 = it.next();
		System.out.println("ob1 "+o1);

		Object o2 = it.next();
		System.out.println("ob2 "+o2);

		Object o3 = it.next();
		System.out.println("ob3 "+o3);

		Object o4 = it.next();
		System.out.println("ob4 "+o4);

		boolean b = it.hasNext();
		System.out.println("Has Next "+b);

		//		Object o5 = it.next();                        //No search element exception
		//		System.out.println("ob5 "+o5);

		for(int i = 0;i<al.size(); i++){
			Object o = al.get(i);
			System.out.println(o);
		}

		ArrayList al1 = new ArrayList<>();
		al1.add(12);
		al1.add(233.88);
		al1.add("momo");
		al1.add(false);
		
		System.out.println("============Using Iterator");
		Iterator it1 = al1.iterator();
		while(it1.hasNext()) {
			Object o = it1.next();
			System.out.println(o);
		}
	}
}
