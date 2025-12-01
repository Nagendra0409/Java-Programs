package com.javaprograms;

public class CountVowels {

	public static void main(String[] args) {
		
		String str = "Quality".toLowerCase();
		int vowels = 0, consonents = 0;
		
		for(char c : str.toCharArray()) {
			if("aeiou".indexOf(c) != -1) vowels++;
			else if(Character.isLetter(c)) consonents++;
		}
		System.out.println("Vowels: " + vowels + " Consonents: " + consonents);
	}

}
