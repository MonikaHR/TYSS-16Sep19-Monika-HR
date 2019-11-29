package com.testyantra.exception.first;

public class BMSThrow {
	public static void main(String[] args) {
		System.out.println("bms started");

		PVRThrow p = new PVRThrow();
		try {
			p.book();
		}
		catch(ArithmeticException ae) {
			System.out.println("Booking Failed");
		}

		System.out.println("bms ended");
	}
}
