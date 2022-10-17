package com.all.arrays;

import java.util.Scanner;

public class oneDArray {

	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("enter the number");
//	int n = sc.nextInt();
//	int[] ar= new int[n];
//	for(int i=0; i<n; i++) {
//		ar[i]= sc.nextInt();
//		
//	}
//	for (int i=0; i<ar.length; i++) {
//		System.out.println(ar[i]);
//	}
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int []ar= new int[n];
		for (int i=0; i<n; i++) {
			ar[i]=sc.nextInt();

		}
		for (int i=0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}

	}

}
