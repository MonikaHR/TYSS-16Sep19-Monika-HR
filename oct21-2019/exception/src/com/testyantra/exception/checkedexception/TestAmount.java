package com.testyantra.exception.checkedexception;

public class TestAmount {
public static void main(String[] args) {
	System.out.println("Main started");
	
	ValidateAmount va = new ValidateAmount();
	
	try {
		va.checkAmount(2000);
		System.out.println("withdraw ur cash");
	} catch (InvalidAmountException e) {
     System.err.println(e.getMessage());
	}
	
	System.out.println("Main ended");
}
}
