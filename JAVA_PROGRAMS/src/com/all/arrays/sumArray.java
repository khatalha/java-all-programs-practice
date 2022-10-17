package com.all.arrays;

import java.util.Scanner;

public class sumArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number size");
		
		int size=sc.nextInt();
		int[] num =new int[size];
		
		for(int i=0; i<size; i++) {
			num[i]= sc.nextInt();
		}
		int sum=0;
		for(int i=0; i<size; i++) {
			sum = sum+num[i];
		}
		
		System.out.println(sum);
	}

}
