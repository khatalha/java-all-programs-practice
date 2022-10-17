package com.barkat.practice;

public class oddeven1 {

	public static void main(String[] args) {
		int arr[]= {23,3,13,8,9,32,34,4,87,2,3,4,4,4,2,2,4,4,76,32,2,3,4,4};
		int even=0;
		int odd=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println(even);
		System.out.println(odd);

	}

}
