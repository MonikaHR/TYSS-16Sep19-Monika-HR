package com.testyantra.immutable;

public class TestString {
	public static void main(String[] args) {
		MyString ms = new MyString(12, "monu");

		System.out.println(ms.getName());
		System.out.println(ms.getRollno());
		System.out.println(ms);

		MyString ms1 =  ms.changeContent(77, "roopa");              //Immutable Contents will not change after change content also
		System.out.println(ms.getName());
		System.out.println(ms.getRollno());

		System.out.println("========================================");

		System.out.println(ms1.getName());                                             
		System.out.println(ms1.getRollno());

	}  
}
