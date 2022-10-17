package com.programs;

import java.util.Scanner;

public class SumOddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		int odd= 0;
		int even=0;
		
		for(int i=0; i<=n;i++) {
			if(i%2==0) {
				//System.out.println("Odd number");
				odd++;
			}
			else {
				//System.out.println("Even number");
				even++;
			}
		}
		
		System.out.println(odd);
		System.out.println(even);

		

	}

}
