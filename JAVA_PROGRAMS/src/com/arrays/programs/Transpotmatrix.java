package com.arrays.programs;

import java.util.Scanner;

class transport{
	int arr[][]= new int[3][3];
	public void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j]= sc.nextInt();
			}
		}
	}
	
	public void display() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void jump() {
		System.out.println("Transport Matrix");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}
	
}

public class Transpotmatrix {

	public static void main(String[] args) {
		transport t = new transport();
		t.getData();
		t.display();
		System.out.println();
		t.jump();

	}

}
