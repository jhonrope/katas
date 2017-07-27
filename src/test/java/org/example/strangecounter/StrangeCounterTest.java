package org.example.strangecounter;


import org.databene.contiperf.PerfTest;
import org.databene.contiperf.junit.ContiPerfRule;
import org.junit.Rule;
import org.junit.Test;

import static org.example.strangecounter.StrangeCounter.getCounter;
import static org.example.strangecounter.StrangeCounter.getCounterOptimized;
import static org.junit.Assert.assertEquals;

public class StrangeCounterTest {

    @Rule
    public ContiPerfRule i = new ContiPerfRule();

    @Test
    public void strangeCounterTest() {
        assertEquals(3, getCounter(1));
        assertEquals(2, getCounter(2));
        assertEquals(1, getCounter(3));
        assertEquals(6, getCounter(4));
        assertEquals(5, getCounter(5));
        assertEquals(4, getCounter(6));
        assertEquals(3, getCounter(7));
        assertEquals(2, getCounter(8));
        assertEquals(1, getCounter(9));
        assertEquals(12, getCounter(10));
        assertEquals(1, getCounter(21));
        assertEquals(24, getCounter(22));
        assertEquals(1, getCounter(45));
    }

    @Test
    @PerfTest(invocations = 100000, threads = 10)
    public void strangeCounterPerf() throws Exception {
        getCounter(Long.MAX_VALUE / 2);
    }

    @Test
    @PerfTest(invocations = 100000, threads = 10)
    public void strangeCounterOptPerf() throws Exception {
        getCounterOptimized(Long.MAX_VALUE / 2);
    }


}
