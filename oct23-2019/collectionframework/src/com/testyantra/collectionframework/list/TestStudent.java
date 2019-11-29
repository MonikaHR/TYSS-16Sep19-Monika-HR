package com.testyantra.collectionframework.list;

import java.util.ArrayList;

public class TestStudent {
	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();
		Student s = new Student(101, "ankitha", 66.8);
		Student s1 = new Student(103, "salman", 99.8);
		Student s2 = new Student(345, "megha", 33.5);

		al.add(s);
		al.add(s1);
		al.add(s2);


		for (int i = 0; i < al.size(); i++) {
			Student st = al.get(i);
			System.out.println("Id is "+st.id);
			System.out.println("Name is "+st.name);
			System.out.println("Percentage is "+st.percent);
		}

		System.out.println("===========for each loop============");
		for(Student ss : al) {
			System.out.println(ss);
		}
	}
}
