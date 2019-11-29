package com.testyantra.hasarelation.weak;

public class TestD {
	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.name);
		c.drives();
		System.out.println("*************");

		System.out.println(c.m.color);
		c.m.play();
	}
}
