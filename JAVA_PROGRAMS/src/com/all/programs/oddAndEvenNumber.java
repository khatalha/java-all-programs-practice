package com.all.programs;

import java.util.Scanner;

public class oddAndEvenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		System.out.println("even numbers");
		for(int i=0; i<=n; i++) {
			System.out.println((2*i)+1);
		}

	}

}
