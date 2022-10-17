package com.arrays.programs;

public class LargeSmallestNumber {

	public static void main(String[] args) {
		int a[] = {13,5,9,5,31,56,6,3,4,67,90};
		
		int large = Integer.MIN_VALUE;
		int small = Integer.MAX_VALUE;
		
		for(int i: a) {
			
			if(i>large) {
				large=i;
			}
			else if(i<small){
				small=i;
			}
		}
		System.out.println(large);
		System.out.println(small);

	}

}
