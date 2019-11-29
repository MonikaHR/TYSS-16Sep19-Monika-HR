package com.testyantra.java8features.predicate;

import java.util.function.Predicate;

public class TestEmployee {
public static void main(String[] args) {
	
	Predicate<Integer> p = e1 -> {
		if(e1.BYTES >= 25000) {
			return true;
		}
		else {
			return false;
		}
	};
	
	
	Employee e1 = new Employee(23, "monu", 26000);
	
	
}
}
