package com.testyantra.singleton;

public class TestSingleton {
	public static void main(String[] args) {

		MySingleton ms =  MySingleton.getDbConnection();
		ms.s = "Hello";
		System.out.println("hashcode of ms is "+ms.hashCode());

		MySingleton mx = MySingleton.getDbConnection();
		mx.s = "Hiii";
		System.out.println("hashcode of mx is "+mx.hashCode());

		System.out.println(ms.s);
		System.out.println(ms.s);
	}
}


