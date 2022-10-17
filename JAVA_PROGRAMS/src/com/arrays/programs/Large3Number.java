package com.arrays.programs;

import java.util.Scanner;

public class Large3Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer 3 number");
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		
		if(a>b && a>c) {
			System.out.println(a+" a is large number");
		}
		else if(b>a && b>c) {
			System.out.println(b+" b is large number");
		}
		else if(c>a && c>b) {
			System.out.println(c+" c is large number");
		}
		else
			System.out.println("a b c are equal");
			
		
	}

}
