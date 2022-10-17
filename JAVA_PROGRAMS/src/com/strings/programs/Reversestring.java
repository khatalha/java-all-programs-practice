package com.strings.programs;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		String  name = new String();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ente the name");
		name= sc.nextLine();
		System.out.println(name);
	
		for(int i=name.length()-1; i>=0; i--) {
			System.out.print(name.charAt(i));
		}
	}

}
