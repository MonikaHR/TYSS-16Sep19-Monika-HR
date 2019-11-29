package com.testyantra.maps;

import java.util.HashMap;

public class TestA {
	public static void main(String[] args) {

		HashMap hm = new HashMap();
		hm.put("monika", 908789);
		hm.put("mala", 896789);
		hm.put("sheela", 896344);

		System.out.println("Data "+hm);
		hm.put("mala", 873256);
		System.out.println("After modify "+hm);
		hm.put("roopa",896344);
		System.out.println("After roopa "+hm);
		hm.put(null, 456477);
		System.out.println("After Null "+hm);
		System.out.println("=====================4");
		hm.put(null, 678789);
		System.out.println("After another Null "+hm);

		Object phoneno = hm.get("sheela");
		System.out.println("value "+phoneno);

		Object phoneno1 = hm.get("lavu");
		System.out.println("valeue "+phoneno1);

		Object value = hm.remove("roopa");
		System.out.println("value "+value);

		System.out.println("After Remove ----------> "+hm);

	}
}
