package org.example.climbingtheleaderboard;


import java.util.Arrays;

class ClimbingTheLeaderboard {
    private final int[] scores;
    private int[] distinctScores;
    private int distinctScoresLength;

    ClimbingTheLeaderboard(int[] scores) {
        this.scores = scores;
        distinctScores = Arrays.stream(scores).distinct().toArray();
        distinctScoresLength = distinctScores.length;
    }

    int[] getScoreOld(int[] alicesScores) {
        int[] response = new int[alicesScores.length];

        for (int i = 0; i < alicesScores.length; i++)
            response[i] = getPosition(alicesScores[i]);

        return response;
    }

    int[] getScore(int[] alicesScores) {
        int[] response = new int[alicesScores.length];

        for (int i = 0; i < alicesScores.length; i++)
            response[i] = getInsertionPoint(alicesScores[i]) + 1;

        return response;
    }

    private int getPosition(int alicesScore) {
        int length = distinctScoresLength;
        for (int i = 0; i < length; i++)
            if (alicesScore >= distinctScores[i])
                return i + 1;
        return length + 1;
    }

    public int getInsertionPoint(int value) {
        int leftBound = 0;
        int rightBound = distinctScoresLength - 1;
        int middleIndex = (rightBound - leftBound) / 2;

        if (distinctScoresLength == 0 || value >= distinctScores[leftBound])
            return 0;

        if (distinctScores[rightBound] > value)
            return rightBound + 1;

        while (rightBound - leftBound > 1) {
            if (distinctScores[middleIndex] > value) {
                leftBound = middleIndex;
            } else if (distinctScores[middleIndex] < value) {
                rightBound = middleIndex;
            } else {
                return middleIndex;
            }

            middleIndex = leftBound + ((rightBound - leftBound) / 2);
        }

        return rightBound;
    }
}
