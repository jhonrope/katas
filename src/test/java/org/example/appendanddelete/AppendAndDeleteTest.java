package org.example.appendanddelete;


import org.junit.Test;

import static org.example.appendanddelete.AppendAndDelete.extract;
import static org.junit.Assert.assertEquals;

public class AppendAndDeleteTest {
    @Test
    public void appendAndDeleteTest() throws Exception {
        assertEquals("Yes", extract("ab", "a", 1));
        assertEquals("Yes", extract("a", "ab", 1));
        assertEquals("No", extract("a", "a", 1));
        assertEquals("Yes", extract("a", "a", 2));
        assertEquals("Yes", extract("abcdefg", "abcdefg", 100));
        assertEquals("Yes", extract("abcdefg", "abcdefg", 99));
        assertEquals("No", extract("abcd", "cdef", 1));
        assertEquals("Yes", extract("ab", "cd", 4));
        assertEquals("Yes", extract("abc", "cd", 5));
        assertEquals("Yes", extract("abc", "ace", 4));
        assertEquals("Yes", extract("abc", "abe", 2));
        assertEquals("No", extract("abc", "abcde", 3));
        assertEquals("Yes", extract("hackerhappy", "hackerrank", 9));
        assertEquals("Yes", extract("aba", "aba", 7));
        assertEquals("Yes", extract("hackerhappy", "hackerhapy", 5));
        assertEquals("No", extract("hackerhappy", "hackerhapy", 6));
        assertEquals("No", extract("hackerhappy", "hackerhapy", 20));
        assertEquals("Yes", extract("hackerhappy", "hackerhapy", 19));
        assertEquals("No", extract("hackerhappy", "hackerhapy", 1));
        assertEquals("No", extract("hackerhappy", "hackerhapy", 2));
        assertEquals("Yes", extract("hackerhappy", "hackerhapy", 3));


    }
}
