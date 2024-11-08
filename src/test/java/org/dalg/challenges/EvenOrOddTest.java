package org.dalg.challenges;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class EvenOrOddTest {

    @Test
    @DisplayName("Should return \"Odd\" for num = 1")
    public void testPositiveOddNumbers() {
        assertEquals("Odd", EvenOrOdd.evenOrOdd(1));
    }

    @Test @DisplayName("Should return \"Even\" for num = 2")
    public void testPositiveEvenNumbers() {
        assertEquals("Even", EvenOrOdd.evenOrOdd(2));
    }

    @Test @DisplayName("Should return \"Odd\" for num = -1")
    public void testNegativeOddNumbers() {
        assertEquals("Odd", EvenOrOdd.evenOrOdd(-1));
    }

    @Test @DisplayName("Should return \"Even\" for num = -2")
    public void testNegativeEvenNumbers() {
        assertEquals("Even", EvenOrOdd.evenOrOdd(-2));
    }

    @Test @DisplayName("Should return \"Even\" for num = 0")
    public void testZero() {
        assertEquals("Even", EvenOrOdd.evenOrOdd(0));
    }
}