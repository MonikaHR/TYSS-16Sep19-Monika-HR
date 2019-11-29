package com.testyantra.hasarelation.weak;

public class TestC {
	public static void main(String[] args) {

		Person p = new Person();
		System.out.println(p.name);
		p.sleep();
		p.eat();
		System.out.println("*****************");

		p.m.write();                        //Has-A relation
		System.out.println(p.m.color);
		System.out.println(p.m.size);
		
	}
}
