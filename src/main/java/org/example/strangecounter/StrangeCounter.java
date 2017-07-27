package org.example.strangecounter;

class StrangeCounter {

    static long getCounterOptimized(long t) {

        long integerPart = (t - 1) / 3;
        long magicIndex = (long) ((Math.log(integerPart + 1) / Math.log(2)) + 1);
        long magicNumber = (long) (1 + 3 * (Math.pow(2, magicIndex) - 1));

        return magicNumber - t;
    }

    static long getCounter(long index) {
        long sum = 4;
        int exponential = 1;
        while (sum - index <= 0) {
            sum += 3 * Math.pow(2, exponential);
            exponential++;
        }
        return sum - index;
    }
}
