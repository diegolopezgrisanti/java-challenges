package org.dalg.challenges;

/*
Write a function to split a string and convert it into an array of words.

Examples (Input ==> Output):
"Robin Singh" ==> ["Robin", "Singh"]

"I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]
 */
public class StringToArray {

    public static String[] stringToArray(String s) {

        return s.split(" ");
    }
}