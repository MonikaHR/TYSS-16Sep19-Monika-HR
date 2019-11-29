package com.testyantra.objectclass;

public class TestCow {
public static void main(String[] args) {
	Cow c1 = new Cow(1, "ganga", 10000);
	
	Cow c2 = new Cow(2, "tunga", 20000);
	
	Cow c3 = new Cow(3, "gowri", 15000);
	
	Cow c4 = c3;
	
	System.out.println(c1.hashCode());
	System.out.println(c2.hashCode());
	System.out.println(c3.hashCode());
	System.out.println(c4.hashCode());
	
	boolean isEqual = c1.equals(c2);
	System.out.println(isEqual);
	System.out.println(c2.equals(c3));
	System.out.println(c3.equals(c4));
	
	
}
}
