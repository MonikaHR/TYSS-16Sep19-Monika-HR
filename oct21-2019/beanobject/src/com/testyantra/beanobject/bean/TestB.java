package com.testyantra.beanobject.bean;

import java.util.Scanner;

public class TestB {
	public static void main(String[] args) {
		System.out.println("Scanner class");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Age is "+age);

		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Name is "+name);

		System.out.println("Enter designation");
		String desig = sc.nextLine();
		System.out.println("Designation is "+desig);
		sc.close();
	}
}
