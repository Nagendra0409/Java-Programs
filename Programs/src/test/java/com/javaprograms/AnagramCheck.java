package com.javaprograms;

public class AnagramCheck {

	public static void main(String[] args) {
		
		String str1 = "listen";
        String str2 = "silent";

        if (isAnagram(str1, str2))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }

    static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        for (int i = 0; i < a1.length - 1; i++) {
            for (int j = i + 1; j < a1.length; j++) {
                if (a1[i] > a1[j]) {
                    char temp = a1[i];
                    a1[i] = a1[j];
                    a1[j] = temp;
                }
                if (a2[i] > a2[j]) {
                    char temp = a2[i];
                    a2[i] = a2[j];
                    a2[j] = temp;
                }
            }
        }

        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i])
                return false;
        }

        return true;
	}

}
