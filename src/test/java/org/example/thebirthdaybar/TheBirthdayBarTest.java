package org.example.thebirthdaybar;

import org.databene.contiperf.PerfTest;
import org.databene.contiperf.junit.ContiPerfRule;
import org.junit.Rule;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;


public class TheBirthdayBarTest {

    private final List<Integer> lista = generateInts(100000);

    @Rule
    public ContiPerfRule i = new ContiPerfRule();

    @Test
    public void theBirthdayBarTest() {

        assertEquals(0, new BirthdayBar(2, 4, asList()).countBreakingWays());
        assertEquals(1, new BirthdayBar(1, 1, asList(1)).countBreakingWays());
        assertEquals(0, new BirthdayBar(1, 1, asList(2)).countBreakingWays());
        assertEquals(1, new BirthdayBar(1, 4, asList(4)).countBreakingWays());
        assertEquals(2, new BirthdayBar(1, 3, asList(3, 3, 6, 7, 2)).countBreakingWays());
        assertEquals(1, new BirthdayBar(2, 3, asList(1, 2, 3, 7, 5)).countBreakingWays());
        assertEquals(4, new BirthdayBar(2, 3, asList(1, 2, 1, 2, 1)).countBreakingWays());
        assertEquals(2, new BirthdayBar(3, 4, asList(1, 2, 1, 2, 1)).countBreakingWays());
        assertEquals(0, new BirthdayBar(4, 5, asList(1, 2, 3, 4, 5, 6, 7)).countBreakingWays());
        assertEquals(1, new BirthdayBar(4, 5, asList(1, 2, 3, 2, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6)).countBreakingWays());
        assertEquals(0, new BirthdayBar(2, 4, asList(4, 3, 4)).countBreakingWays());
        assertEquals(1, new BirthdayBar(1, 3, asList(3, 0, 0, 0)).countBreakingWays());
    }

    @Test
    @PerfTest(invocations = 100, threads = 10)
    public void theBirthdayBarPerf() throws Exception {

        BirthdayBar bb = new BirthdayBar(10000, 30000, lista);
        bb.countBreakingWays2();

    }

    @Test
    @PerfTest(invocations = 100, threads = 10)
    public void theBirthdayBarOptimizedPerf() throws Exception {

        BirthdayBar bb = new BirthdayBar(10000, 30000, lista);
        bb.countBreakingWays();

    }

    private List<Integer> generateInts(int length) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            list.add(random.nextInt(5) + 1);
        }
        return list;
    }
}
