package com.all.programs;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c;
		System.out.println(a);
		System.out.println(b);
		 c=a;
		 a=b;
		 b=c;
		 
		a = a*b;
		b= a/b;
		a= a/b;
		
		System.out.println("After Swapping");
		 System.out.println(a);
		 System.out.println(b);
		

	}

}
