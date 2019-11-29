package com.testyantra.java8features;

import java.util.function.Predicate;

public class TestStudent {
public static void main(String[] args) {
	
	Predicate<Student> p = s -> {
		if(s.percentage >= 35) {
			return true;
		}
		else {
			return false;
		}
	};
	
	Student s = new Student(1, "ramu", 56.8);
	boolean res = p.test(s);
	System.out.println("Result is = "+res);
	
}
}
