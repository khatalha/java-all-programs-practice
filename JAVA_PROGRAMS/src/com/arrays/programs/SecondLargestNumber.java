package com.arrays.programs;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the value of Array");
		 
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		Arrays.sort(arr);
		
		System.out.println("second Largest Number is"+ arr[arr.length-2]);
	}

}
