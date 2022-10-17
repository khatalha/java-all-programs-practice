package com.all.programs;

import java.util.Scanner;

public class TableNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		for(int i=1; i<=20; i++) {
			System.out.println(n*i);
			
		}
	

	}

}
