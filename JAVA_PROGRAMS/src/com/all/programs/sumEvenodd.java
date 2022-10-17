package com.all.programs;

import java.util.Scanner;

public class sumEvenodd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int odd=0;
		int even = 0;
		
		for(int i=1; i<=n; i++) {
			if(i%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		
		System.out.println(odd);
		System.out.println(even);
		
		

	}

}
