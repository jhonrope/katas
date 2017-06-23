package org.example.primefactors;


import org.junit.Test;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.example.primefactors.PrimeFactors.generate;
import static org.junit.Assert.assertEquals;

public class PrimeFactorsTest {

    @Test
    public void primeFactorsTest() throws Exception {
        assertEquals(emptyList(), generate(1));
        assertEquals(singletonList(2), generate(2));
        assertEquals(singletonList(3), generate(3));
        assertEquals(asList(2, 2), generate(4));
        assertEquals(singletonList(5), generate(5));
        assertEquals(asList(2, 3), generate(6));
        assertEquals(singletonList(7), generate(7));
        assertEquals(asList(2, 2, 2), generate(8));
        assertEquals(asList(3, 3), generate(9));
        assertEquals(asList(2, 2, 3, 3, 3, 5, 7, 11, 13), generate(2 * 2 * 3 * 3 * 3 * 5 * 7 * 11 * 13));
    }
}
