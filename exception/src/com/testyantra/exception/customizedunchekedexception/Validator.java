package com.testyantra.exception.customizedunchekedexception;

public class Validator {
    void verify(int age) {
    	if(age < 18) {
    		throw new InvalidAgeException("try again next time");
    	}
    }
}
