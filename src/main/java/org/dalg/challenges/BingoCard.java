package org.dalg.challenges;

/*
After yet another dispute on their game the Bingo Association decides to change course and automate the game.

Can you help the association by writing a method to create a random Bingo card?

Bingo Cards
A Bingo card contains 24 unique and random numbers according to this scheme:

5 numbers from the 'B' column in the range 1 to 15
5 numbers from the 'I' column in the range 16 to 30
4 numbers from the 'N' column in the range 31 to 45
5 numbers from the 'G' column in the range 46 to 60
5 numbers from the 'O' column in the range 61 to 75
Task
Write the function get_card()/getCard(). The card must be returned as an array of Bingo style numbers:

[ 'B14', 'B12', 'B5', 'B6', 'B3', 'I28', 'I27', ... ]
The numbers must be in the order of their column: B, I, N, G, O. Within the columns the order of the numbers is random.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class BingoCard {
    public static String[] getCard() {
        ArrayList<String> bingoCard = new ArrayList<>();

        bingoCard.addAll(generateColumn('B', 1, 15, 5));
        bingoCard.addAll(generateColumn('I', 16, 30, 5));
        bingoCard.addAll(generateColumn('N', 31, 45, 4));
        bingoCard.addAll(generateColumn('G', 46, 60, 5));
        bingoCard.addAll(generateColumn('O', 61, 75, 5));

        return bingoCard.toArray(new String[0]);
    }

    private static ArrayList<String> generateColumn(char column, int startRange, int endRange, int count) {
        Random random = new Random();
        Set<Integer> uniqueNumbers = new HashSet<>();
        ArrayList<String> columnNumbers = new ArrayList<>();

        while (uniqueNumbers.size() < count) {
            int number = random.nextInt(endRange - startRange + 1) + startRange;
            if (uniqueNumbers.add(number)) {
                columnNumbers.add(column + String.valueOf(number));
            }
        }

        return columnNumbers;
    }
}