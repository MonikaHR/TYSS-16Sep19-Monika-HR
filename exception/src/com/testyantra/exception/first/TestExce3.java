package com.testyantra.exception.first;

public class TestExce3 {
	public static void main(String[] args) {

		System.out.println("main started");

		int[] a = {10,20,30,40};
		int b = 10;

		try {
			System.out.println(b/0);
		}

		catch(ArithmeticException ae) {
			System.out.println("number is divided by zero");
		}




		try {
			System.out.println(a[4]);

		}

		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("array index not found");
		}
		System.out.println("main ended");
	}
}
