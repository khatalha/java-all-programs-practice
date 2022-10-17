package com.arrays.programs;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySerach {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the key");
		int key = sc.nextInt();
		
		int a[] = {1,3,5,9,5,3,56,6,3,4,67,9};
		Arrays.sort(a);
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		int i=0;
		int j=a.length-1; int flag=0; int mid; 
		int pos;
		
		while(i<=j&&flag==0) {
			mid=(i+j)/2;
			
			if(a[mid]==key) {
				flag=1;
				pos= mid+1;
			}
			else if(a[mid]>key) {
				j= mid-1;
			}
			else {
				i=mid+1;
			}
		
		}
		if(flag==0) {
			System.out.println("not found");
		}
		else {
			System.out.println("found");
		}
		

	}

}
