package org.example.migratory_birds;

import org.databene.contiperf.PerfTest;
import org.databene.contiperf.junit.ContiPerfRule;
import org.junit.Rule;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class MigratoryBirdsTest {

    private final List<Integer> lista = generateInts(1000000);
    @Rule
    public ContiPerfRule i = new ContiPerfRule();

    private List<Integer> generateInts(int length) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            list.add(random.nextInt(5) + 1);
        }
        return list;
    }

    @Test
    public void migratoryBirdsTest() {
        assertEquals(1, birdsFactory(asList(1, 1, 1, 1, 1)));
        assertEquals(2, birdsFactory(asList(2, 2, 2, 2, 2)));
        assertEquals(3, birdsFactory(asList(3, 3, 3, 3, 3)));
        assertEquals(4, birdsFactory(asList(4, 4, 4, 4, 4)));
        assertEquals(5, birdsFactory(asList(5, 5, 5, 5, 5)));
        assertEquals(2, birdsFactory(asList(1, 2, 2, 2, 2)));
        assertEquals(1, birdsFactory(asList(1, 1, 2, 2, 3)));
        assertEquals(2, birdsFactory(asList(1, 2, 4, 1, 2, 3, 4, 5, 4, 3, 2, 2, 1)));
    }

    private int birdsFactory(List<Integer> list) {
        return new Birds(list).findMostCommon();
    }

    @Test
    @PerfTest(invocations = 1000, threads = 4)
    public void migratoryBirdsPerf() {
        birdsFactory(lista);
    }

}
