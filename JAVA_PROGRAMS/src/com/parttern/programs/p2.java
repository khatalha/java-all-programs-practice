package com.parttern.programs;

import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		
		
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
//		for(int i=n; i>=1; i--) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
			
		

	}

}

//* * * * * 		
//* * * * 
//* * * 
//* * 
//* 

//1 2 3 4 5 
//1 2 3 4 
//1 2 3 
//1 2 
//1 


//5 5 5 5 5 
//4 4 4 4 
//3 3 3 
//2 2 
//1 
