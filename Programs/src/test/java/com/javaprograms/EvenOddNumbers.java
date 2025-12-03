package com.javaprograms;

public class EvenOddNumbers {

	public static void main(String[] args) {
		
		System.out.println("Even Numbers:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }

        System.out.println("\n\nOdd Numbers:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
	}

}
