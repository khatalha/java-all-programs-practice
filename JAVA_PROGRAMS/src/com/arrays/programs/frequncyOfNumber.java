package com.arrays.programs;

import java.util.Scanner;

public class frequncyOfNumber {

	public static void main(String[] args) {
		int a[]= {1,2,4,5,65,4,3,4,56,6,4,5,4,5,5,4,5,5,5};
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter thr number");
		
		int key = sc.nextInt();
		
		int count=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]==key) {
				count=count+1;
				
			}
		}
		System.out.println(count);

	}

}
