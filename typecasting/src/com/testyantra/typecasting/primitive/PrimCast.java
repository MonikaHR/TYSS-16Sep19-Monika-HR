package com.testyantra.typecasting.primitive;

public class PrimCast {
	public static void main(String[] args) {	
		int a = 10;
		double b = a;  //Implicit casting
		System.out.println("value of b is "+b);
		int p = 40;
		double q = p;
		System.out.println("value of q is "+q);
		System.out.println("****************************");

		double x = 20.67;
		int y = (int) x;
		System.out.println("value of y is "+y);
		byte z = (byte) x;
		System.out.println("value of z is "+z);
		char r = (char) x;
		System.out.println("value of r is "+r);
	}
}

