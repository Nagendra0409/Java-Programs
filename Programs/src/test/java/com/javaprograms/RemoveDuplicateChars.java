package com.javaprograms;

public class RemoveDuplicateChars {

	public static void main(String[] args) {
		
		String str = "automation";
		String result = "";
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			boolean isDuplicate = false;
			
			for(int j=0; j<result.length(); j++) {
				if(ch == result.charAt(j)) {
					isDuplicate = true;
					break;
				}
			}
			if(!isDuplicate) {
				result = result + ch;
			}
		}
		System.out.println("Without Duplicates: " + result);
	}

}
