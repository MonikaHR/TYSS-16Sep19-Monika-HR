package com.testyantra.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public  class TestFF {
	public static void main(String[] args) {

		Stack<TestD> al = new Stack<TestD>();
		TestD p = new TestD("monu", 22, "BE");
		TestD p1 = new TestD("kavya", 24, "BSC");
		TestD p2 =  new TestD("megha", 21, "BE");
		al.add(p);
		al.add(p1);
		al.add(p2);

		for (int i = 0; i < al.size(); i++) {
			TestD pp = al.get(i);
			System.out.println("Person name is "+pp.name);
			System.out.println("Person age is "+pp.age);
			System.out.println("Pesron qualification is "+pp.qualification);
		}

		System.out.println("==============for each loop=================");
		for(TestD pt : al) {
			System.out.println(pt);
		}

		System.out.println("============Iterator=================");
		Iterator i = al.iterator();
		while(i.hasNext()) {
			Object ob = i.next();
			System.out.println(ob);
		}

		System.out.println("===============List Iterator================");
		ListIterator<TestD> li = al.listIterator();
		System.out.println("==========Forward");
		while(li.hasNext()) {
			Object ob2 = li.next();
			System.out.println(ob2);
		}

	}
}
