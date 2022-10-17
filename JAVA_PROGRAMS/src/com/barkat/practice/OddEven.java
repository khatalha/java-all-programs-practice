package com.barkat.practice;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		try {
		int n = sc.nextInt();
		
		
		
			for(int i=0; i<=n; i++) {
				
				if(i%2==0) {
					System.out.println(i);
				}
				
			}
			
		}
		catch(Exception e) {
			System.out.println("Enter valid number");
		}
		
		
		
	}

}
