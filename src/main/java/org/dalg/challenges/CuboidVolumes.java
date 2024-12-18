package org.dalg.challenges;

/*
In this simple exercise, you will create a program that will take two lists of integers, a and b. Each list will
consist of 3 positive integers above 0, representing the dimensions of cuboids a and b. You must find the difference
of the cuboids' volumes regardless of which is bigger.

For example, if the parameters passed are ([2, 2, 3], [5, 4, 1]), cube a has a volume of 12, and cube b has a volume
of 20. Therefore, the function should return 8.

Your function will be tested with pre-made examples as well as random ones.

If you can, try writing it in one line of code.
 */

public class CuboidVolumes {

    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {

        return Math.abs((firstCuboid[0] * firstCuboid[1] * firstCuboid[2]) -
                (secondCuboid[0] * secondCuboid[1] * secondCuboid[2]));
    }

}