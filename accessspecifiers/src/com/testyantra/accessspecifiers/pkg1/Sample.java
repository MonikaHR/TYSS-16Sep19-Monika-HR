package com.testyantra.accessspecifiers.pkg1;

import com.testyantra.accessspecifiers.pkg2.Demo;

public class Sample {
	public static void main(String[] args) {
		Demo d = new Demo();
		/*System.out.println(d.a);
		 * Not Possible
		d.add();
		*/
		//Default
		Sample s = new Sample();
		/*System.out.println(s.b);
		s.sub();*/
		//Protected
		/*System.out.println(d.c);
		d.mul();*/
		//public
		System.out.println(d.name);
		d.div();
		
	}
}
