package org.example.drawingbook;

import org.junit.Assert;
import org.junit.Test;

public class DrawingBookTest {
    @Test
    public void drawingBookTest() throws Exception {
        Assert.assertEquals(0, new DrawingBook(6).getMinimumTurnPages(1));
        Assert.assertEquals(1, new DrawingBook(6).getMinimumTurnPages(2));
        Assert.assertEquals(1, new DrawingBook(6).getMinimumTurnPages(3));
        Assert.assertEquals(2, new DrawingBook(10).getMinimumTurnPages(4));
        Assert.assertEquals(2, new DrawingBook(10).getMinimumTurnPages(5));
        Assert.assertEquals(0, new DrawingBook(10).getMinimumTurnPages(10));
        Assert.assertEquals(1, new DrawingBook(10).getMinimumTurnPages(9));
        Assert.assertEquals(1, new DrawingBook(10).getMinimumTurnPages(8));
        Assert.assertEquals(2, new DrawingBook(10).getMinimumTurnPages(7));
        Assert.assertEquals(0, new DrawingBook(9).getMinimumTurnPages(9));
        Assert.assertEquals(0, new DrawingBook(9).getMinimumTurnPages(8));
        Assert.assertEquals(1, new DrawingBook(9).getMinimumTurnPages(7));
        Assert.assertEquals(2, new DrawingBook(9).getMinimumTurnPages(5));
    }
}
