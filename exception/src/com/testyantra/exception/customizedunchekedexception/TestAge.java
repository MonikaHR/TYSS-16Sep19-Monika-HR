package com.testyantra.exception.customizedunchekedexception;

public class TestAge {
public static void main(String[] args) {
	System.out.println("main started");
	
	Validator v = new Validator();
	try {
	 v.verify(2);
	}
	catch(InvalidAgeException i) {
		System.out.println("age is invalid");
	}
	
	v.verify(13);
	
	
	
	System.out.println("main ended");
}
}
