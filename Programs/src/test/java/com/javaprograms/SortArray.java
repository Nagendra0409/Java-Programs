package com.javaprograms;

public class SortArray {

	public static void main(String[] args) {
		
		int[] arr = {5, 3, 1, 4, 2};
        int temp;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted Array: ");
        for (int n : arr) {
            System.out.print(n + " ");
        }
	}

}
