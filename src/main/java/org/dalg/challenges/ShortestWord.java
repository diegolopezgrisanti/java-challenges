package org.dalg.challenges;

/*
Simple, given a string of words, return the length of the shortest word(s).

String will never be empty, and you do not need to account for different data types.
 */
public class ShortestWord {

    public static int findShort(String s) {
        String[] arrS = s.split(" ");
        int lengthShortWords = arrS[0].length();

        for (String arr : arrS) {
            if (arr.length() < lengthShortWords) {
                lengthShortWords = arr.length();
            }
        }

        return lengthShortWords;
    }

}