package com.all.arrays;

import java.util.Scanner;

public class linearSearch {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		
		int size=sc.nextInt();
		int[] num =new int[size];
		System.out.println("enter the elements");
		for(int i=0; i<size; i++) {
			num[i]= sc.nextInt();
		}
		for(int i=0; i<size; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		System.out.println("enter the key");
		int key = sc.nextInt();
		int flag=0; int pos;
		for(int i=0; i<num.length; i++) {
			if(num[i]==key) {
				pos = i+1;
				flag=1;
			}
		}
		
		if(flag==0) {
			System.out.println("number not found");
		}
		else {
			System.out.println("number found");
		}
		
		

	}

}
