package com.testyantra.objectclass;

public class TestCar {
	public static void main(String[] args) {
		Car s = new Car(6700000,"BMW","White");
		int h = s.hashCode();
		System.out.println(h);
		String s1 = s.toString();
		System.out.println(s1);

	}
}
