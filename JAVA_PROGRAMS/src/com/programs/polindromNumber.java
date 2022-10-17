package com.programs;

import java.util.Scanner;

public class polindromNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int result = n;
		int rem=1;
		int rev = 0;
		
		while(n!=0) {
			rem=n%10;
			rev= rev*10+ rem;
			n=n/10;
		}
		if(result==rev) {
			System.out.println("its polindrom");
		}
		else {
			System.out.println("not a polindrom");
		}
	}

}
