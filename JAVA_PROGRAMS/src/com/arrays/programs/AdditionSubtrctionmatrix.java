package com.arrays.programs;

import java.util.Scanner;

class InpitSend{
	int a[][] = new int[3][3];
	int b[][] = new int[3][3];
	int c[][] = new int[3][3];
	
	public void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a Array:");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3;j++) {
				//System.out.println("Enter the value: ");
				a[i][j]= sc.nextInt();
			}
			
		}
		
		System.out.println("Enter the value of b Array");
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3;j++) {
				//System.out.println("Enter the value: ");
				b[i][j]= sc.nextInt();
			}
		}
			
	}
	

	public void Addition() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3;j++) {
				c[i][j] = a[i][j] + b[i][j];
				
			}
			
		}
	}
	public void display() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3;j++) {
				System.out.print(c[i][j]+" ");
				
			}
			System.out.println();
		}
	}
	

}
public class AdditionSubtrctionmatrix {

	public static void main(String[] args) {
		
		InpitSend p = new InpitSend();
		p.getData();
		p.display();
		System.out.println();
		p.Addition();
		p.display();
	}

}


