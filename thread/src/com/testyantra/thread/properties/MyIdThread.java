package com.testyantra.thread.properties;

public class MyIdThread extends Thread{
public static void main(String[] args) {
	
	System.out.println("Main Started");
	
	System.out.println(Thread.currentThread().getId());
	
	MyIdThread mi = new MyIdThread();
	System.out.println("myid thread "+mi.getId());
	
	System.out.println("Priority "+Thread.currentThread().getPriority());
	
//	mi.setId();              cannot set id there is no set() method
	 
//	Thread.currentThread().setPriority(16);             priorities from 1 to 10 only
	                                           //Illegal Arguement Exception
	
	System.out.println("main ended");
}
}
