package com.all.arrays;

import java.util.Arrays;

public class secondlargestnumberbarkat {

	public static void main(String[] args) {
		int[] n = {12,13,14,15,16,17,18,19,20};
		Arrays.sort(n);
		for(int i=0; i<n.length; i++) {
			System.out.println(n[i]);
			
		}
		
		System.out.println(n[n.length-2]);
	}

}
