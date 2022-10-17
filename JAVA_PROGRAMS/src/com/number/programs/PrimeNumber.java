package com.number.programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int flag=0;
		for(int i=0; i<=n; i++) {
			if(n%2==0) {
				flag=1;
				System.out.println("not a prime number");
				break;
			}
		
		}
		
		if(flag==0) {
			System.out.println("Prime Number");
		}

	}

}
