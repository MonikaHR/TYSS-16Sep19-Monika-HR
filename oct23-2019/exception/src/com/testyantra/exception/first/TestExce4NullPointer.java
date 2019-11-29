package com.testyantra.exception.first;

public class TestExce4NullPointer {
	public static void main(String[] args) {

		System.out.println("main started");

		String s = "hello";
		int[] a = {10,20,30,40};
		int b = 10;

		try {
			String s1 = s.toUpperCase();
			System.out.println(s1);
			System.out.println(a[4]);
			System.out.println(b/0);
		}
		catch(NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException  npe) {
			System.out.println("dnt play with null");
		}
//		catch(ArrayIndexOutOfBoundsException aie) {
//			System.out.println("array index not found");
//		}
//		catch(ArithmeticException ae) {
//			System.out.println("number is divided by zero");
// 		}
		

		System.out.println("main ended");
	} 
}
