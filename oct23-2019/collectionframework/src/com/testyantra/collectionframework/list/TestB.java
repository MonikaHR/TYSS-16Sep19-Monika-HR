package com.testyantra.collectionframework.list;

import java.util.ArrayList;

public class TestB {
 public static void main(String[] args) {
	
	 ArrayList al = new ArrayList();
	 al.add(10);
	 al.add(29.7);
	 al.add(true);
	 al.add("kavya");
	 al.remove(3);
	 al.add(10);
	 al.add(null);
	 al.add(null);
	 
	 for(Object o : al) {
		 System.out.println(o);
	 }
}
}
