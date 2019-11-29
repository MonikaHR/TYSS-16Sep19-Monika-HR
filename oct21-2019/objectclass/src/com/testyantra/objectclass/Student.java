package com.testyantra.objectclass;

public class Student {
	String name;
	int id;
	String Percen;
	public Student(String name, int id, String percen) {
		super();
		this.name = name;
		this.id = id;
		Percen = percen;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public String toString() {
		return " name is "+name+" id is "+id+" percentage is "+Percen;
	}
}
