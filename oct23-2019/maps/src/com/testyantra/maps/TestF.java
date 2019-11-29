package com.testyantra.maps;

import java.util.Hashtable;

public class TestF {
	public static void main(String[] args) {

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(101, "ajay");
		ht.put(102, "vijay");
		ht.put(100, "sonu");
		ht.put(144, "monu");
		ht.put(101, "sriram");
		//  ht.put(null, "john");          //Null Pointer Exception
		// ht.put(67, null);                     //Null Pointer Exception

		System.out.println("Data "+ht);
        	}
}
 