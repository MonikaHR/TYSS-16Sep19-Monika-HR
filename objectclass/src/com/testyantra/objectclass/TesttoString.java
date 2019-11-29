package com.testyantra.objectclass;

public class TesttoString {
  public static void main(String[] args) {
	  
	MarkertoString m = new MarkertoString();
	int h = m.hashCode();
	System.out.println("hash code of marker ="+h);
	String s = m.toString();
	System.out.println("tostring value of marker ="+s);
	
	MarkertoString p = new MarkertoString();
	System.out.println(p);
}
}
