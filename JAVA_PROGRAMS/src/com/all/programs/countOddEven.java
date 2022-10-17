package com.all.programs;

public class countOddEven {

	public static void main(String[] args) {
		int [] a = {1,3,4,5,6,43,5,5,65,32,45,5,6,6,5,32,4,5,64};
		System.out.println(a.length);
		
		int odd=0;
		int even=0;
		for(int i=0; i<=a.length; i++){
			
			if(i%2==0) {
			
				even++;
				//System.out.println(i);
			}
			
			if(i%2==1) {
				
				odd++;
			}
			
		}
		System.out.println(even);
		System.out.println(odd);

	}

}
