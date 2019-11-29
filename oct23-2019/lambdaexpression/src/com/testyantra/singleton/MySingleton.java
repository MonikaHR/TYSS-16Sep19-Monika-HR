package com.testyantra.singleton;

public class MySingleton {

//	private static MySingleton instance = null;
	private static MySingleton instance =new MySingleton();
	String s;

	private  MySingleton() {

	}

	public static MySingleton getDbConnection() {

//		if(instance == null) {
//			instance = new MySingleton();
//			return instance;
//
//		} else {
//			return instance;
//		}
		
		return instance;

	}


}
