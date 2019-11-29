package com.testyantra.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTS {
	public static void main(String[] args) {

		TreeSet<Employeee> hs = new TreeSet<Employeee>();
		Employeee e1 = new Employeee(33, "megha", 56000);
		Employeee e2= new Employeee(78, "roopa", 34000);
		Employeee e3 = new Employeee(34, "giri", 18000);
		Employeee e4 = new Employeee(89, "sheela", 26000);
		Employeee e5 = new Employeee(89, "sheela", 26000);

		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);

		System.out.println("========Using Iterator==========");
		Iterator<Employeee> it = hs.iterator();
		while (it.hasNext()) {
			Employeee ee = it.next();
			System.out.println("Id is "+ee.id);
			System.out.println("Name is "+ee.name);
			System.out.println("Salary is "+ee.salary);
			System.out.println("====================================");

		}
	}
}

