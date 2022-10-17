package com.arrays.programs;

import java.util.Scanner;

class Base{
	int size=10; int key;
	int a[] = new int[size];
	public void getData() {
		
		Scanner sc = new Scanner (System.in);
	
		
		
		System.out.println("enter the element");
		for(int i=0; i<size;i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the key");
		key = sc.nextInt();
	}
	
	
	
	int flag=0; int pos;
	public void Search() {
		int i;  
		for( i=0; i<size&&flag==0; i++) {
			
			if(a[i]==key) {
				flag=1;
				pos = i+1;
			}
		}
		
		if(flag==1) {
			System.out.println("number found"+ pos);
		}
		else {
			System.out.println("number not found");
		}
	}
	
	
	
}
public class LinearSerach {

	public static void main(String[] args) {
	
		Base ob = new Base();
		ob.getData();
		ob.Search();
		System.out.println("bfjeskjx");

	}

}
