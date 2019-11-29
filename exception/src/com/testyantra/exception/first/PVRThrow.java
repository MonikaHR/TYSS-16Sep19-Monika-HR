package com.testyantra.exception.first;

public class PVRThrow {
	void book() {
		System.out.println("booking started");

		try {
			System.out.println(10/0);
			System.out.println("logic for booking");
			System.out.println("booking confirmed");
		}
		catch(ArithmeticException ae) {
			System.out.println("Booking failed");
			throw ae;
		}

		System.out.println("booking ended");
	}
}
