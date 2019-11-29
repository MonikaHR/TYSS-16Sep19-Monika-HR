package com.testyantra.objectclass;

public class TestHash {
  public static void main(String[] args) {
	PenHash p = new PenHash();
	int pHashCode = p.hashCode();
	System.out.println("hash code of p "+pHashCode);
	
	PenHash q = new PenHash();
	int qHashCode = q.hashCode();
	System.out.println("hash code of q "+qHashCode);
	
	
}
}
