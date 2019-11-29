package com.testyantra.collectionframework.list;

public class TestH {
	String name;
	int id;
	String bloodgroup;
	int salary;

	public TestH(String name, int id, String bloodgroup, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.bloodgroup = bloodgroup;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", bloodgroup=" + bloodgroup + ", salary=" + salary + "]";
	}



}
