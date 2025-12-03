package com.javaprograms;

public class ReverseEachWord {

	public static void main(String[] args) {
		
		String str = "Java Selenium Automation";
		
		String word = "";
		String result = "";
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch != ' ') {
				word = ch + word;
			}else {
				result = result + word + " ";
				word = "";
			}
		}
		
		result = result + word;
		System.out.println(result);
	}

}
