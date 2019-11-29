package com.testyantra.collectionframework.list;

import java.util.ArrayList;

public class TestD {
	String name;
	int age;
	String qualification;

	public TestD(String name, int age, String qualification) {
		super();
		this.name = name;
		this.age = age;
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", qualification=" + qualification + "]";
	}



}

