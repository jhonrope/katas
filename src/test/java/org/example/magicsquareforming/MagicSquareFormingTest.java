package org.example.magicsquareforming;

import org.junit.Test;

import static org.example.magicsquareforming.MagicSquareForming.findMinimumCost;
import static org.junit.Assert.assertEquals;

public class MagicSquareFormingTest {
    @Test
    public void magicSquareFormingTest() throws Exception {
        int[][] magicSquare = {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};
        assertEquals(0, findMinimumCost(magicSquare));
        magicSquare[2][2] = 5;
        assertEquals(1, findMinimumCost(magicSquare));
        int[][] magicSquare2 = {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}};
        assertEquals(0, findMinimumCost(magicSquare2));
        magicSquare2[0][2] = 5;
        assertEquals(1, findMinimumCost(magicSquare2));


    }
}
