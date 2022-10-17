package com.number.programs;

import java.util.Scanner;

public class fibbonacci {
	

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int prev = 0; int next =1;
		int result=0;
		if(n<0) {
			System.out.println("invalid Number");
		}
		else {
			for(int i=0; i<=n; i++) {
				System.out.print(prev+" ");
				result = prev+next;
				prev = next;
				next=result;
			}
		}
	}

	

}
