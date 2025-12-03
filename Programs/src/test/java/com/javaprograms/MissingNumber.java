package com.javaprograms;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 4, 6};
		int n = 6;
		
		boolean[] present = new boolean[n+1];
		
		for(int i=0; i<arr.length; i++) {
			present[arr[i]] = true;
		}
		System.out.println("Missing Numbers:");
		
		for(int i=1; i<=n; i++) {
			if(!present[i]) {
				System.out.println(i);
			}
		}
	}

}
