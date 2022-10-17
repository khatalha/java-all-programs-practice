package com.all.arrays;

import java.util.Scanner;

public class SumOf2Arrays {
	int a[][] = new int[3][3];
	int b[][] = new int[3][3];
	int c[][] = new int[3][3];
	
	public void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element for A");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("enter the element for B");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				b[i][j] = sc.nextInt();
			}
		}

	}
	
	
	public void SumArrays() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				c[i][j] =a[i][j] + b[i][j]; 
			}
		}
	}
	
	
	public void display() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		SumOf2Arrays sum = new SumOf2Arrays();
		sum.getData();
		sum.display();
		sum.SumArrays();
		sum.display();

	}

}
