package com.arrays.programs;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,2,4};
		
		Set<Integer> du = new HashSet<>();
		Set<Integer> ndu = new HashSet<>();
		
		for(Integer z :arr) {
			 if(!ndu.contains(z)) {
				 ndu.add(z);
			 }
			 else {
				 du.add(z);
			 }
		}
		System.out.println(du);
		

	}

}
