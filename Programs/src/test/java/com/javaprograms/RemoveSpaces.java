package com.javaprograms;

public class RemoveSpaces {

	public static void main(String[] args) {
		
		String str = "Java Selenium Automation";
		String Result = "";
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) != ' ') {
				Result = Result + str.charAt(i);
			}
		}
		System.out.println("String without spaces: " + Result);
	}

}
