package com.programs;

import java.util.Scanner;

public class summulnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		int rem=1;
		int rev = 1;
		
		while(n!=0) {
			rem=n%10;
			rev= rev* rem;// if addition + replace by *
			n=n/10;
		}
		System.out.println(rev);

	}

}
