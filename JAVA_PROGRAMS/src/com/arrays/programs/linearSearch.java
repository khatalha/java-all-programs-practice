package com.arrays.programs;

import java.util.Scanner;

public class linearSearch {

	public static void main(String[] args) {
		int flag=0; 
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int size = sc.nextInt();
		int a[] = new int[size];

		
		
		for(int i=0; i<size;i++) {
			a[i] = sc.nextInt();
		}
		int key;
		System.out.println("Enter the key");
		key = sc.nextInt();
		
		
		int i;  int pos;
		
		for( i=0; i<size; i++) {
			
			if(a[i]==key) {
				flag=1;
				pos = i+1;
			}
		}
		
		if(flag==1) {
			System.out.println("number found");
		}
		else {
			System.out.println("number not found");
		}

	}

}
