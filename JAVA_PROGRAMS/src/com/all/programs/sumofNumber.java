package com.all.programs;

import java.util.Scanner;

public class sumofNumber {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number");
//		int n = sc.nextInt();
//		
//		
//		int sum = 0;
//		for(int i=0; i<=n; i++) {
//			sum = sum +i;
//			
//		}
//		System.out.println(sum);
		
		
		
		int arr[]= {23,3,13,8,9,32};
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
		}
		
		System.out.println(sum);
		
	}


}
