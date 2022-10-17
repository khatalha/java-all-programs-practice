package com.all.programs;

import java.util.Scanner;

public class sumOfOddNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sum =0;
		for(int i=0; i<=n; i++) {
			if(i%2==1) {
				sum = sum +i;
			}
		}
		System.out.println(sum );
	}

}
