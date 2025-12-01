package com.javaprograms;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		
		int[] arr = {12, 35, 1, 10, 34, 1};
		
		 int largest = Integer.MIN_VALUE;
		 int secondlargest = Integer.MIN_VALUE;
		 
		 for(int i=0; i<arr.length; i++) {
			 int num = arr[i];
			 
			 if(num > largest) {
				 secondlargest = largest;
				 largest = num;
			 }else if(num > secondlargest && num != largest) {
				 secondlargest = num;
			 }
		 }
		 System.out.println("Second Largest: " + secondlargest);
	}

}
