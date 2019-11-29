package com.testyantra.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestD {
	public static void main(String[] args) {

		LinkedHashMap<String, Integer> lh = new LinkedHashMap<String , Integer>();
		lh.put("banglore", 560068);
		lh.put("hariyana", 134203);
		lh.put("patna", 888000);

		for(Map.Entry<String, Integer> m : lh.entrySet()) {
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println(" key is "+key+"---------"+"value is "+value);
		}



	}
}
