package com.testyantra.exception.checkedexception;

public class ValidateAmount {

	void checkAmount(int amount) throws InvalidAmountException {

		if(amount > 40000) {

			throw new InvalidAmountException();
		}
	}
}
