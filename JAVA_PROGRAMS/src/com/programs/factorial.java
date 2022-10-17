package com.programs;

import java.util.Scanner;

public class factorial {
	
	public static int factoo(int n) {
		int fact=1;
		if(n==0 || n==1) {
			return 1;
		}
		else {
			for(int i=2; i<=n;i++) {
				fact= fact*i;
			}
			return fact;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		
		if(n<0) {
			System.out.println("Enter the valid input");
		}
		else {
			int result =factoo(n);
			System.out.println(result);
		}
			
	}

}


