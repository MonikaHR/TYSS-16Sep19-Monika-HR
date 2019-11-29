package com.testyantra.lamdaexpressions;

public class TestSquare {
public static void main(String[] args) {
	
	SquareInterface sq = x -> x*x;
	int sq1 = sq.square(2);
	System.out.println("Square value is "+sq1);
}
}
