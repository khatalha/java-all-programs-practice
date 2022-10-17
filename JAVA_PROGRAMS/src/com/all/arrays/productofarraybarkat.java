package com.all.arrays;

import java.util.Scanner;

public class productofarraybarkat {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int[] num = new int[n];
		for(int i=0; i<n; i++) {
			num[i]= sc.nextInt();
			
		}
		int sum = 1;
		for(int i=1; i<n;i++) {
			sum=sum*num[i];
		}
		System.out.println(sum);
		
		

	}

	}


