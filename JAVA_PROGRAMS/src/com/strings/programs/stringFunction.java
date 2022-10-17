package com.strings.programs;

import java.util.Scanner;

public class stringFunction {

	public static void main(String[] args) {
		String  name = new String();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ente the name");
		name= sc.nextLine();
		System.out.println(name);
		
		System.out.println(name.length());
		
		System.out.println(name.charAt(6));
		String lcase = name.toLowerCase();
		System.out.println(lcase);
		
		String Ucase = name.toUpperCase();
		System.out.println(Ucase);
	}

}
