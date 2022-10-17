package com.all.arrays;

import java.awt.geom.Area;
import java.util.Arrays;
import java.util.Scanner;

public class barkatsmallestlargest {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the number");
//		int n = sc.nextInt();
//		int[] ar = new int[n];
//		for(int i=0; i<n; i++) {
//			ar[i]= sc.nextInt();
//		}
//			
//		for(int i=0; i<ar.length; i++) {
//			System.out.println(	ar[i]);
//	}
//		}
//}
		int n[]=  {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		Arrays.sort(n);
		for (int i=0; i<n.length; i++) {
			System.out.println(n[i]);
	}
		System.out.println(n[0]);
		System.out.println(n[n.length-1]);
}

}
