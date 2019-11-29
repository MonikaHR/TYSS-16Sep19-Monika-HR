package com.testyantra.thread.defining;

public class TestMyThread {
	public static void main(String[] args) {

		System.out.println("Main Started");

		MyThread t1 = new MyThread();
		/*t1.run(); 
		 *  Dont call run() method, it behaves like a normal program
		 *  all code will be executed inside main thread only
		 */                                
		t1.start();
		//		t1.start();  IllegalThreadStateException

		for(int j=0; j<10; j++) {
			System.out.println("Main Thread");
		}

		System.out.println("Main Ended");
	}
}
