package com.all.programs;

import java.util.Scanner;

public class printOddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

//		for(int i=1; i<=n; i++){
//			System.out.println(2*i);
//		}
		
		
		for(int i=1; i<=n; i++){
			System.out.println((2*i)-1);
		}

	}

}
