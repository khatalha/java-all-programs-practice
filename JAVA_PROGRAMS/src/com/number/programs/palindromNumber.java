package com.number.programs;

import java.util.Scanner;

public class palindromNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int m=n;
		int rem =1;
		int rev =0;
		while(n!=0) {
			rem = n%10;
			rev =  (rev*10)+rem;
			n=n/10;
		}
		if(rev==m) {
			System.out.println("palindrm number");
		}
		else {
			System.out.println("not a Palindrom number");
		}

	}

}
