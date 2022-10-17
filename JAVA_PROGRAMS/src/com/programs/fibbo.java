package com.programs;

import java.util.Scanner;

public class fibbo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		int prev=0; int next=1; int result=0;
		
		if(n<=0) {
			System.out.println("Enter the valid input");
		}
		else {
			for(int i=1; i<=n; i++) {
				System.out.println(prev+" ");
				result= prev+next;
				prev= next;
				next=result;
			}
			
		}
	
	}

}
