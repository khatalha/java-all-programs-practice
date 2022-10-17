package com.all.arrays;

import java.util.Scanner;

public class tranport2 {

	public static void main(String[] args) {
		int a[][]= new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element for A");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}

	}

}
