package com.testyantra.objectclass;

public class TestClone {
	public static void main(String[] args) throws CloneNotSupportedException {

		PersonClone p = new PersonClone(12, "manju");
		System.out.println("p id "+p.id);
		System.out.println("p name "+p.name);

		Object o = p.clone();
		PersonClone p1 = (PersonClone) o;
		System.out.println("p1 id is "+p1.id);
		System.out.println("p1 name is "+p1.name);
		p1.id = 200;
		p1.name = "surya";
		System.out.println("---------After Cloning-----------");
		System.out.println("p1 id "+p.id);
		System.out.println("p1 name "+p.name);
		System.out.println("p1 id is "+p1.id);
		System.out.println("p1 name is "+p1.name);
		


	}
}
