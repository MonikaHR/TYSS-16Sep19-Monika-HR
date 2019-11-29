package com.testyantra.stringclass;

public class TestArray {
	public static void main(String[] args) {
		int[] nums = {10,20,30,40};
		String[] names = {"monika","megha","kavya","roopa"};
		
		//	System.out.println(nums[10]);    Array index out of bound exception
		recieve(nums);
		int[] values = getArray();

		for(int val : values) {
			System.out.println(val);
		}
		
		recieve1(names);
		String[] value = getArray1();

		for(String v : value) {
			System.out.println(v);
		}
		
		
	}

	static void recieve(int[] numbers) {
		for(int num: numbers) {
			System.out.println(num);
		}
		System.out.println("****************");
	}

	static int[] getArray() 
	{
		int[] values = {20,30,40,50};
		return values;
	}
	
	
	
	
	
	
	
	static void recieve1(String[] name) {
		for(String nam: name) {
			System.out.println(nam);
		}
		System.out.println("****************");
	}
	
	static String[] getArray1() 
	{
		String[] naming = {"mon","lavu","surya"};
		return naming;
	}
	
	
	
	
	
	
}
