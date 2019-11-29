package com.testyantra.maps;

import java.util.HashMap;

public class TestB {
	public static void main(String[] args) {

		HashMap hm = new HashMap();
		hm.put("monika", 908789);
		hm.put("mala", 896789);
		hm.put("sheela", 896344);

		HashMap hm1 = new HashMap();
		hm1.put("puttu", 567845);
		hm1.put("kittu", 782134);
		hm1.put("bittu", 672341);

		boolean key = hm.containsKey("mala");
		System.out.println("Has key = "+key);

		boolean value = hm.containsValue(782526);
		System.out.println("Has value = "+value);

		hm.putAll(hm1);
		System.out.println("==========================");
		System.out.println("After putall "+hm);

		System.out.println(hm.size());

		boolean isEmpty = hm.isEmpty();
  



	}
}
