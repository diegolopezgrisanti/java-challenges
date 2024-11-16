package org.dalg.challenges;

import java.util.Arrays;

/*
An anagram is the result of rearranging the letters of a word to produce a new word (see wikipedia).

Note: anagrams are case insensitive

Complete the function to return true if the two arguments given are anagrams of each other; return false otherwise.

Examples
"foefet" is an anagram of "toffee"

"Buckethead" is an anagram of "DeathCubeK"
 */

public class AnagramDetection {
    public static boolean isAnagram(String a, String b) {
        if (a.length() == b.length()) {
            if (a.isEmpty()) {
                return true;
            }

            a = a.toLowerCase();
            char[] charsA = a.toCharArray();
            for (int i = 0; i < a.length(); i++) {
                for (int j = 0; j < a.length() - 1; j++) {
                    if (charsA[j] > charsA[j + 1]) {
                        char temp = charsA[j];
                        charsA[j] = charsA[j + 1];
                        charsA[j + 1] = temp;
                    }
                }
            }

            b = b.toLowerCase();
            char[] charsB = b.toCharArray();
            for (int i = 0; i < b.length(); i++) {
                for (int j = 0; j < b.length() - 1; j++) {
                    if (charsB[j] > charsB[j + 1]) {
                        char temp = charsB[j];
                        charsB[j] = charsB[j + 1];
                        charsB[j + 1] = temp;
                    }
                }
            }

            return Arrays.equals(charsA, charsB);
        }

        return false;
    }

}