package com.testyantra.objectclass;

public class TestStudent {
	public static void main(String[] args) {
		
	
	Student s = new Student("kavya",99,"89%");
	int h = s.hashCode();
	System.out.println(h);
	String s1 = s.toString();
	System.out.println(s1);
	
	}
}
