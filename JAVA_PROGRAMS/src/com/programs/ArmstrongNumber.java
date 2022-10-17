package com.programs;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		int num=n;
		int count=0;
		while(num!=0) {
			count++;
			num=num/10;
		}
		//System.out.println(count);
		num=n;  int sum=0; int digit;
		while(num!=0) {
			digit=num%10;
			int pro=1;
			for(int i=1;i<=count; i++) 
				pro= pro*digit;
			
			sum= sum+pro;
			num= num/10;
		}
		
		if(n==sum) {
			System.out.println("its Armstrong Number");
		}
		else {
			System.out.println("Not A Armstong Number");
		}
		
		
	}

}
