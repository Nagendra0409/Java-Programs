package com.javaprograms;

public class WordCount {

	public static void main(String[] args) {
		
		String str = "Selenium with Java automation";
		
		String[] words = str.trim().split("\s");
		System.out.println("Total Words: " + str.length());
	}

}
