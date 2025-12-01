package com.javaprograms;

import java.util.HashMap;

public class CharFrequency {

	public static void main(String[] args) {
		
		String str = "Testing";	
		//Output : {s=1, T=1, t=1, e=1, g=1, i=1, n=1}
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		System.out.println(map);
		
		
		String str1 = "Testing".toLowerCase();
		//Output is line by line
		HashMap<Character, Integer> map1 = new HashMap<>();
		for (char c : str1.toCharArray()) {
			map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
		for (char key : map1.keySet()) {
            System.out.println(key + "=" + map1.get(key));
        }
	}

}

