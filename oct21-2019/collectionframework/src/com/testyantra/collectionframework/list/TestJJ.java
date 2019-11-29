package com.testyantra.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class TestJJ {
	public static void main(String[] args) {

		Vector<TestH> al = new Vector<TestH>();
		TestH e = new TestH("lavu",123, "B+", 25000);
		TestH e1 = new TestH("megha", 345, "A+", 20000);
		TestH e2 = new TestH("kavya", 156, "O+", 30000);
		al.add(e);
		al.add(e1);
		al.add(e2);

		System.out.println("==========For Loop=============");
		for (int i = 0; i < al.size(); i++) {
			TestH ee = al.get(i);
			System.out.println("Employee name is "+ee.name);
			System.out.println("Empoyee id is "+ee.id);
			System.out.println("Employee bloodgroup is "+ee.bloodgroup);
			System.out.println("Employee salaty is "+ee.salary);
		}

		System.out.println("=======For each loop=============");
		for(TestH em : al) {
			System.out.println(al);
		}

		System.out.println("===============Iterator============");
		Iterator<TestH> i = al.iterator();
		while(i.hasNext()) {
			Object o = i.next();
			System.out.println(o);
		}

		System.out.println("=============List Iterator==========");
		ListIterator<TestH>  li = al.listIterator();
		while(li.hasNext()) {
			Object o1 = li.next();
			System.out.println(o1);
		}

	}
}
