package org.example.dayoftheprogrammer;


import org.junit.Assert;
import org.junit.Test;

public class DayOfTheProgrammerTest {
    @Test
    public void dayOfTheProgrammer() throws Exception {
        Assert.assertEquals("13.09.2017", DayOfTheProgrammer.getDay(2017));
        Assert.assertEquals("12.09.2016", DayOfTheProgrammer.getDay(2016));
        Assert.assertEquals("13.09.2100", DayOfTheProgrammer.getDay(2100));
        Assert.assertEquals("12.09.2000", DayOfTheProgrammer.getDay(2000));
        Assert.assertEquals("12.09.1900", DayOfTheProgrammer.getDay(1900));
        Assert.assertEquals("12.09.1700", DayOfTheProgrammer.getDay(1700));
        Assert.assertEquals("26.09.1918", DayOfTheProgrammer.getDay(1918));
        Assert.assertEquals("13.09.2700", DayOfTheProgrammer.getDay(2700));

    }
}
