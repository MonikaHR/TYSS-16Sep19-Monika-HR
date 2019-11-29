package com.testyantra.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestGenerics {
public static void main(String[] args) {
	
	ArrayList<String> al = new ArrayList<String>();
	al.add("anupama");
	al.add("pooja");
	al.add("kavitha");
	al.add("sunitha");
	
	String str = al.get(0);
    System.out.println(str.toUpperCase());	
    
    Iterator<String> li = al.iterator();
    while(li.hasNext()) {
    	String s = li.next();
    	System.out.println(s);
    }
    
    System.out.println("=====Using List Iterator===================");
    ListIterator<String> li1 = al.listIterator();
//    while(li1.hasPrevious()) {                                 methods inside ListIterators
//    	String s1 = li1.previous();
//    	System.out.println(s1);
//    }
    while(li1.hasNext()) {
    	String s2 = li1.next();
    	System.out.println(s2);
    }
    
    System.out.println("=========Using for each====================");
    
    for(String ss : al) {
    	System.out.println(ss);
    }
	
}
}
