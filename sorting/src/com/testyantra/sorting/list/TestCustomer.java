package com.testyantra.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TestCustomer {
 public static void main(String[] args) {
	
	 SortByNameCustomer sn = new SortByNameCustomer();
	 TreeSet<Customer> ts = new TreeSet<Customer>(sn);
	 Customer c1 = new Customer("radha", 234, 23000);
	 Customer c2 = new Customer("gaana", 456, 65444);
	 Customer c3 = new Customer("lava", 324, 33200);
	 Customer c4 = new Customer("pooja", 786, 34000);
	 
	 ts.add(c1);
	 ts.add(c2);
	 ts.add(c3);
	 ts.add(c4);
	 
	 System.out.println("=============Iterate using Iterator========");
	 Iterator<Customer> it = ts.iterator();
	 while(it.hasNext()) {
		 Customer cc = it.next();
		 System.out.println("Customer Name is "+cc.name);
		 System.out.println("Customer ID is "+cc.id);
		 System.out.println("Customer salary is "+cc.salary);
		 System.out.println("=============================");
	 }
}
}
