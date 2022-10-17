package com.all.arrays;

import java.util.Scanner;

public class TransportArray {
	
	int a[][] = new int[3][3];
	
	public void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element for A");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				a[i][j] = sc.nextInt();
			}
		}
	}
	
	
	public void Transport() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(a[j][i]+" "); 
			}
			System.out.println();
		}
	}
	
	public void display() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		TransportArray t = new TransportArray();
		t.getData();
		t.display();
		t.Transport();

	}

}
