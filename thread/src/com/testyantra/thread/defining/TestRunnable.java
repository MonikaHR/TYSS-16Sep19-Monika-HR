package com.testyantra.thread.defining;

public class TestRunnable {
	public static void main(String[] args) {

		System.out.println("Main Started");

		MyRunnable mr = new MyRunnable();
//		mr.start();     Start is undefined in MyRunnable

		Thread t1 = new Thread(mr);
		t1.start();

		for(int j=0; j<10; j++) {
			System.out.println("Main thread");
		}
		
		System.out.println("Main Ended");


	}
}
