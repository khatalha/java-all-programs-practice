package com.arrays.programs;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		int a[] = {1,3,5,9,5,3,56,6,3,4,67,9};
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		Arrays.sort(a);
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
		}
	}

}
