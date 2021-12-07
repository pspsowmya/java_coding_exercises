package com.techreturners.exercise005;

public class Exercise005 {
    public boolean isPangram(String input) {
        int n = 0;
        boolean[] alphabets = new boolean[26];

        for (int i = 0; i < input.length(); i++) {
            if ('a' <= input.charAt(i) && input.charAt(i) <= 'z') {
                n = input.charAt(i) - 'a';
            } else if ('A' <= input.charAt(i) && input.charAt(i) <= 'Z') {
                n = input.charAt(i) - 'A';
            }
            alphabets[n] = true;
        }

        for (int j = 0; j < 26; j++) {
            if (!alphabets[j]) {
                return false;
            }
        }
        return true;
    }
}
