package org.dalg.challenges;

/*
Write a function to split a string and convert it into an array of words.

Examples (Input ==> Output):
"Robin Singh" ==> ["Robin", "Singh"]

"I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]
 */
public class StringToArray {

    public static String[] stringToArray(String s) {
        int countWords = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                countWords++;
            }
        }

        String[] solution = new String[countWords+1];
        int positionWord = 0;
        String word = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                solution[positionWord] = word;
                positionWord++;
                word = "";
            } else {
                word += s.charAt(i);
            }
        }
        solution[positionWord] = word;

        return solution;
    }
}