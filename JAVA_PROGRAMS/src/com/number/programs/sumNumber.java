package com.number.programs;

import java.util.Scanner;

public class sumNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		int sum=0; int rem=0;
		while(n!=0) {
			rem = n%10;
			sum= sum+rem;
			n=n/10;
		}
		System.out.println(sum);
	}

}
