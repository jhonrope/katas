package org.example.savetheprisoner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaveThePrisonerTest {
    @Test
    public void saveThePrisonerTest() {
        assertEquals(1, new SaveThePrisoner(1).getWarning(1, 1));
        assertEquals(1, new SaveThePrisoner(2).getWarning(1, 1));
        assertEquals(2, new SaveThePrisoner(2).getWarning(1, 2));
        assertEquals(2, new SaveThePrisoner(3).getWarning(1, 2));
        assertEquals(3, new SaveThePrisoner(3).getWarning(2, 2));
        assertEquals(1, new SaveThePrisoner(3).getWarning(2, 3));
        assertEquals(1, new SaveThePrisoner(3).getWarning(4, 1));
        assertEquals(2, new SaveThePrisoner(3).getWarning(2, 1));
        assertEquals(1, new SaveThePrisoner(3).getWarning(7, 1));
        assertEquals(2, new SaveThePrisoner(3).getWarning(7, 2));
        assertEquals(3, new SaveThePrisoner(3).getWarning(7, 3));
        assertEquals(2, new SaveThePrisoner(5).getWarning(2, 1));
        assertEquals(3, new SaveThePrisoner(5).getWarning(2, 2));
        assertEquals(3, new SaveThePrisoner(5).getWarning(5, 4));
        assertEquals(3, new SaveThePrisoner(5).getWarning(10, 4));
        assertEquals(3, new SaveThePrisoner(5).getWarning(15, 4));
        assertEquals(3, new SaveThePrisoner(5).getWarning(20, 4));


    }
}
