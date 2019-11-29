package com.testyantra.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestStudent {
	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();

		Student s1 = new Student(22, "Monu", 85.6);
		Student s2 = new Student(43, "kavya", 30.2);
		Student s3 = new Student(88, "Roopa", 60.0);
		Student s4 = new Student(80, "lavanya", 28.9);

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		System.out.println("Before Sorting ---------------");
		displayStudentdetails(al);
		Collections.sort(al);
		System.out.println("After Sorting --------------");
		displayStudentdetails(al);

	}

	static void displayStudentdetails(ArrayList<Student> al) {
		Iterator<Student> li = al.iterator();
		while(li.hasNext()) {
			Student s =	li.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("-----------------------------------------");
		}
	}
}
