package com.testyantra.java8features;

import java.util.ArrayList;

public class TestS {
	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(6, "vikram", 56.7));
		al.add(new Student(3, "vijay", 37.9));
		al.add(new Student(8, "yash", 35.7));
		al.add(new Student(2, "akshay", 67.9));
		al.add(new Student(4, "raju", 88.0));
		
		Helper h = new Helper();
//		h.displayAllStudent(al);
//	    h.displayFailedStudent(al);
	    h.displayPassedStudent(al);
	    System.out.println("=========Topper of the class ===========");
	    h.topperOfTheClass(al);

	}
}
