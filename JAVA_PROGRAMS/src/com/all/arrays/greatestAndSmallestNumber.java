package com.all.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class greatestAndSmallestNumber {

	public static void main(String[] args) {
//	
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter number size");
//		
//		int size=sc.nextInt();
//		int[] num =new int[size];
//		
//		for(int i=0; i<size; i++) {
//			num[i]= sc.nextInt();
//		}
		int num[]= {12,3,45,34,23344,7,4,1,5,356,5,7,6,3,4,6,7,356,56,5,55,35,54,35,2,3,4,5,567};
		
		Arrays.sort(num);
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		System.out.println(num[0]);
		System.out.println(num[num.length-1]);
	}

}
