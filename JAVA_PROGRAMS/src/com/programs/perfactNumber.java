package com.programs;

import java.util.Scanner;

public class perfactNumber {
	
	public static int perfact(int n) {
		int sum=0;
		for(int i=1; i<n;i++) {
			if(n%i==0) {
				sum= sum+i;
			}
		}
		return sum;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		
		if(n<=0) {
			System.out.println("invalid number");
		}
		else {
			int result = perfact(n);
			if(n==result) {
				System.out.println("perfact number");
			}
			else {
				System.out.println("Not A perfact number");
			}
			
		}

	}

}
