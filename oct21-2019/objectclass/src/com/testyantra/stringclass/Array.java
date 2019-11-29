package com.testyantra.stringclass;

public class Array {
	public static void main(String[] args) {
		int[] nums = new int[5];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;

		for(int i =0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("******************");
		
		int[] variable = {10,20,30,40,50};
		for(int j=0; j<variable.length; j++) {
			System.out.println(variable[j]);
		}
		System.out.println("******************");
		
		
		for(int k : nums) {                        //////For-Each Loop
			System.out.println(k);
		}
		System.out.println("*******************");
		
		byte[] nums1 = {1,4,6,7,9};
		for(int l=0; l<nums1.length; l++) {
			System.out.println(nums1[l]);
			System.out.println("*************");
		}
		
		byte[] nums2 = {1,4,6,7,9};
		for(int m : nums2) {
			System.out.println(m);
		}
		System.out.println("*****************");
		
		double[] db = {10.0,20.0,30.0,40.0,50.0};
		for(int n=0; n<db.length; n++) {
			System.out.println(db[n]);
		}
		System.out.println("**************");
		
		double[] db1 = {10.0,20.0,30.0,40.0,50.0};
		for(double o : db1) {
			System.out.println(o);
		}
		System.out.println("*****************");
		
		String[] names = {"monika","kavya","manasa","megha"};
		for(int f=0; f<names.length; f++) {
			System.out.println(names[f]);
		}
		System.out.println("*****************");
		for(String g : names) {
			System.out.println(g);
		}
		
		
		
}
}                                  
