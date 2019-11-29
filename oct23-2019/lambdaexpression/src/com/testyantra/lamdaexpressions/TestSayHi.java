package com.testyantra.lamdaexpressions;

public class TestSayHi {
  public static void main(String[] args) {
	
	 SayHiInterface h =  () -> 
	 System.out.println("Hiii");
	 h.sayHi();
	  
}
}
