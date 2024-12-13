package org.dalg.challenges;

/*
Enjoying your holiday, you head out on a scuba diving trip!

Disaster!! The boat has caught fire!!

You will be provided a string that lists many boat related items. If any of these items are "Fire" you must spring into
action. Change any instance of "Fire" into "~~". Then return the string.

Go to work!
 */

public class FireOnTheBoat {
    public static String fireFight(String s) {

        return s.replace("Fire", "~~");
    }
}