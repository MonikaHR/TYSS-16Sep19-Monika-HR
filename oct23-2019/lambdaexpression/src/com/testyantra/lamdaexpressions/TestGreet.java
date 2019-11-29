package com.testyantra.lamdaexpressions;

public class TestGreet {
	public static void main(String[] args) {

		GreetInterface gree = (message) -> { 
			System.out.println("Hellow");
			System.out.println(message);

		};
		gree.greet("hiiiiiiiiiii");

	}
}
