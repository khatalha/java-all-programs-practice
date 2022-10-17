package com.number.programs;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int m=n;
		int count=0;
		
		while(m!=0) {
			count++;
			m=m/10;
			
		}
		//System.out.println(count);
		
		m=n; int digit;  int sum=0;
		//System.out.println(m);
		while(m!=0) {
			digit=m%10;
			int pro=1;
			for(int i=1; i<=count; i++) {
				pro = pro*digit;
			
			}
			sum= sum+pro;
			m= m/10;
		}
		
		if(n==sum) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not A armstrong Number");
		}
		
		

	}

}
