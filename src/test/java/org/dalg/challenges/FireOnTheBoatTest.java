package org.dalg.challenges;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FireOnTheBoatTest {

    @Test
    public void basicTest() {
        String case1 = "Boat Rudder Mast Boat Hull Water ~~ Boat Deck Hull ~~ Propeller Deck ~~ Deck Boat Mast";
        String case2 = "Mast Deck Engine Water ~~";
        String case3 = "~~ Deck Engine Sail Deck ~~ ~~ ~~ Rudder ~~ Boat ~~ ~~ Captain";
        String case4 = "~~, Mast Propeller Hull ~~";
        assertEquals(case1, FireOnTheBoat.fireFight("Boat Rudder Mast Boat Hull Water Fire Boat Deck Hull Fire Propeller Deck Fire Deck Boat Mast"));
        assertEquals(case2, FireOnTheBoat.fireFight("Mast Deck Engine Water Fire"));
        assertEquals(case3, FireOnTheBoat.fireFight("Fire Deck Engine Sail Deck Fire Fire Fire Rudder Fire Boat Fire Fire Captain"));
        assertEquals(case4, FireOnTheBoat.fireFight("Fire, Mast Propeller Hull Fire"));
    }
}