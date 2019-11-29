package com.testyantra.objectclass;

public class TestEmployeeTest {
 public static void main(String[] args) {
	EmployeeEquals e1 = new EmployeeEquals(1, "monika", 45000);
	
	EmployeeEquals e2 = new EmployeeEquals(2,"kavya", 20000);
	
	EmployeeEquals e3 = e2;
	
	System.out.println(e1.equals(e2));
	System.out.println(e2.equals(e3));
	
	String s1 = e1.toString();
	System.out.println(s1);
	
	String s2 = e2.toString();
	System.out.println(s2);
	
	String s3  = e3.toString();
	System.out.println(s3);
}
}
