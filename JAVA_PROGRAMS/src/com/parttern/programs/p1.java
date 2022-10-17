package com.parttern.programs;

import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		
		
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		

		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}


//*					
//* *	
//* * *
//* * * *

//1
//1 2
//1 2 3
//1 2 3 4

//1
//2 2
//3 3 3
//4 4 4 4