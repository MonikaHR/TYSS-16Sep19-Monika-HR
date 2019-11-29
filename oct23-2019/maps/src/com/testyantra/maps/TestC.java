package com.testyantra.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestC {
	public static void main(String[] args) {

		LinkedHashMap<String, Integer> lh = new LinkedHashMap<String , Integer>();
		lh.put("banglore", 560068);
		lh.put("hariyana", 134203);
		lh.put("patna", 888000);

		System.out.println(lh);

		Set<String> s =  lh.keySet();


		System.out.println("======for each loop==========");
		for(String key : s) {
			System.out.println("key "+key);
		}
			Collection<Integer> c = lh.values();
			
			System.out.println("==foreach==");
			for(Integer value : c) {
				System.out.println("value "+value);
			
		}
	}
}
