package com.testyantra.exception.first;


public class TestExce1 {
	public static void main(String[] args) {

		System.out.println("main started");

		int a = 10;
		int b = 0;
		try {
			b = a/0;
			System.out.println(b);
			System.out.println("hii");
			System.out.println("happy diwali");

		}
		catch(ArithmeticException ae) {
			System.out.println("number is divided by zero");
		}

		System.out.println("main ended");
	}
}
