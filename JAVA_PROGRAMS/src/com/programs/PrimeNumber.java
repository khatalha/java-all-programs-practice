package com.programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		if(n<=0) {
			System.out.println("Enter the valid input");
		}
		else {
			int flag=0;
			for(int i=2; i<n; i++) {
				if(n%i==0) {
					System.out.println("NOT A PRIME NUMBERS");
					flag=1;
					break;
					
				}
				
			}
			if(flag==0) {
				System.out.println("PRIME NUMBER"); 
			}
			
		}
		
		
	}

}
