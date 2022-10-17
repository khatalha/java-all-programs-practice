package com.strings.programs;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		String  name = new String();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ente the name");
		name= sc.nextLine();
		System.out.println(name);
		String rev="";
		for(int i=name.length()-1; i>=0; i--) {
			rev=rev+name.charAt(i);
		}
		
		if(name.equalsIgnoreCase(rev)) {
			System.out.println("Palindrom String");
		}
		else {
			System.out.println("Not Palindrom String");
		}
	
		
	}

}
