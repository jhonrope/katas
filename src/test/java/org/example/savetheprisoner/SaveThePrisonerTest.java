package org.example.savetheprisoner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaveThePrisonerTest {
    @Test
    public void saveThePrisonerTest() {
        assertEquals(1, new SaveThePrisoner(1).getWarning(1, 1));
        assertEquals(1, new SaveThePrisoner(1).getWarning(1, 1));
    }
}
