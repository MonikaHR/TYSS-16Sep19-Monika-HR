package com.testyantra.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestEmployee {
	public static void main(String[] args) {

		Employee s1 = new Employee(78, "lashmitha", 20000);
		Employee s2 = new Employee(48, "roopa", 67000);
		Employee s3 = new Employee(99, "kavya", 45000);
		Employee s4 = new Employee(23, "lavu", 20000);
		Employee s5 = new Employee(70, "kittu", 56000);
		Employee s6 = new Employee(73, "puttu", 25000);
		Employee s7 = new Employee(78, "bittu", 33000);
		Employee s8 = new Employee(97, "cheeku", 26000);
		Employee s9 = new Employee(56, "siibu", 45500);

		ArrayList<Employee> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);

		ArrayList<Employee> al1 = new ArrayList<>();
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);

		ArrayList<Employee> al2 = new ArrayList<>();
		al2.add(s7);
		al2.add(s8);
		al2.add(s9);

		HashMap<String, ArrayList<Employee>> hm = new HashMap<>();
		hm.put("Manager1", al);
		hm.put("Manager2", al1);
		hm.put("Manager3", al2);

		ArrayList<Employee> Manager3 =  hm.get("Manager3");

		Iterator<Employee> it = Manager3.iterator();
		while(it.hasNext()) {
			Employee s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("salary is "+s.salary);
			System.out.println("============================");
		}


	}
}
