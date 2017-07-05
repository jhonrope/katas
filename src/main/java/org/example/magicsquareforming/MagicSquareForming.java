package org.example.magicsquareforming;


import java.util.Arrays;

class MagicSquareForming {


    private static int[][][] base = new int[][][]{
            {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
            {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
            {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
            {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},
            {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
            {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
            {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
            {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}}};

    static int findMinimumCost(int[][] magicSquare) {
        int[] baseCosts = {0, 0, 0, 0, 0, 0, 0, 0};
        for (int k = 0; k < 8; k++)
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    baseCosts[k] += Math.abs(magicSquare[i][j] - base[k][i][j]);

        return Arrays.stream(baseCosts).min().getAsInt();
    }
}
