package com.all.arrays;

import java.util.Scanner;

public class NumberFrequency {

	public static void main(String[] args) {
		int num[]= {1,2,3,4,5,6,75,3,4,5,7,4,5,75,4};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key");
		
		int key=sc.nextInt();
		int count=0;
		for(int i=0; i<num.length; i++) {
			if(num[i]==key) {
				count++;
			}
		}
		System.out.println(count);
	}

}
