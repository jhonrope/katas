package org.example.climbingtheleaderboard;

import org.databene.contiperf.PerfTest;
import org.databene.contiperf.junit.ContiPerfRule;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class ClimbingTheLeaderboardTest {

    @Rule
    public ContiPerfRule i = new ContiPerfRule();

    @Test
    public void climbingTheLeaderboardTest() throws Exception {

        assertArrayEquals(new int[]{1}, new ClimbingTheLeaderboard(new int[]{}).getScore(new int[]{1}));
        assertArrayEquals(new int[]{1}, new ClimbingTheLeaderboard(new int[]{1}).getScore(new int[]{1}));
        assertArrayEquals(new int[]{2}, new ClimbingTheLeaderboard(new int[]{2}).getScore(new int[]{1}));
        assertArrayEquals(new int[]{2}, new ClimbingTheLeaderboard(new int[]{3}).getScore(new int[]{1}));
        assertArrayEquals(new int[]{1, 1}, new ClimbingTheLeaderboard(new int[]{}).getScore(new int[]{1, 2}));
        assertArrayEquals(new int[]{1, 1}, new ClimbingTheLeaderboard(new int[]{1}).getScore(new int[]{1, 2}));
        assertArrayEquals(new int[]{2, 1}, new ClimbingTheLeaderboard(new int[]{2}).getScore(new int[]{1, 2}));
        assertArrayEquals(new int[]{1, 1}, new ClimbingTheLeaderboard(new int[]{1}).getScore(new int[]{2, 3}));
        assertArrayEquals(new int[]{2, 2}, new ClimbingTheLeaderboard(new int[]{3}).getScore(new int[]{1, 2}));
        assertArrayEquals(new int[]{1, 1, 1}, new ClimbingTheLeaderboard(new int[]{1}).getScore(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1}, new ClimbingTheLeaderboard(new int[]{1, 1}).getScore(new int[]{1}));
        assertArrayEquals(new int[]{2}, new ClimbingTheLeaderboard(new int[]{2, 1}).getScore(new int[]{1}));
        assertArrayEquals(new int[]{3}, new ClimbingTheLeaderboard(new int[]{3, 2}).getScore(new int[]{1}));
        assertArrayEquals(new int[]{2}, new ClimbingTheLeaderboard(new int[]{3, 2}).getScore(new int[]{2}));
        assertArrayEquals(new int[]{1}, new ClimbingTheLeaderboard(new int[]{3, 2}).getScore(new int[]{3}));
        assertArrayEquals(new int[]{3, 2, 1}, new ClimbingTheLeaderboard(new int[]{3, 2}).getScore(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{6, 4, 2, 1}, new ClimbingTheLeaderboard(new int[]{100, 100, 50, 40, 40, 20, 10}).getScore(new int[]{5, 25, 50, 120}));


    }

    @Test
    public void binarySearchTest() {
        assertEquals(0, new ClimbingTheLeaderboard(new int[]{}).getInsertionPoint(1));
        assertEquals(1, new ClimbingTheLeaderboard(new int[]{3}).getInsertionPoint(1));
        assertEquals(0, new ClimbingTheLeaderboard(new int[]{2}).getInsertionPoint(3));
        assertEquals(0, new ClimbingTheLeaderboard(new int[]{3, 2}).getInsertionPoint(3));
        assertEquals(2, new ClimbingTheLeaderboard(new int[]{3, 2}).getInsertionPoint(1));
    }

    @Test
    @PerfTest(invocations = 100000, threads = 10)
    public void climbingPerfTest() {
        new ClimbingTheLeaderboard(new int[]{100, 100, 50, 40, 40, 20, 10}).getScoreOld(new int[]{5, 25, 50, 120});
    }

    @Test
    @PerfTest(invocations = 100000, threads = 10)
    public void climbingPerfTestOpti() {
        new ClimbingTheLeaderboard(new int[]{100, 100, 50, 40, 40, 20, 10}).getScore(new int[]{5, 25, 50, 120});
    }
}
