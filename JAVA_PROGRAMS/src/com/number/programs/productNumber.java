package com.number.programs;

import java.util.Scanner;

public class productNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		int mul=1; int rem=0;
		while(n!=0) {
			rem = n%10;
			mul= mul*rem;
			n=n/10;
		}
		System.out.println(mul);
	}

}


