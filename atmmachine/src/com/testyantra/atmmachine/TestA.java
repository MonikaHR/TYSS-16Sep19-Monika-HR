package com.testyantra.atmmachine;

public class TestA {
	public static void main(String[] args) {
		HDFC h = new HDFC();

		Machine m = new Machine();
		m.slot(h);

		ICICI i = new ICICI();
		m.slot(i);
		
		SBI s = new SBI();
		m.slot(s);
	}
	
}
