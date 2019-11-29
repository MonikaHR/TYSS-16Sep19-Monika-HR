package com.testyantra.lamdaexpressions;

public class TestFactorial {
public static void main(String[] args) {
	
	FactorialInterface f = (num) -> {
		
		int fact = 1;
		for(int i = 2; i<=num; i++) {
			fact = fact*i;
		}
		return fact;
	};
	
	int factTotal = f.factorial(5);
	System.out.println("Factorial is "+factTotal);
}
}
