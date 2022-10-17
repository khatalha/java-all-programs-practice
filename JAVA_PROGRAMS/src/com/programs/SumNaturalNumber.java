package com.programs;

import java.util.Scanner;

public class SumNaturalNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sum= 0;
		if(n<0) {
			System.out.println("Enter the valid input");
		}
		else {
			for(int i=0; i<=n; i++) {
				sum=sum+i;
			}
			System.out.println(sum);
		}
	}

}
