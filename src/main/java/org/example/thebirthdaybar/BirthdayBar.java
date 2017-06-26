package org.example.thebirthdaybar;

import java.util.List;


class BirthdayBar {

    private int window;
    private List<Integer> list;
    private int expectedSum;
    private int listSize;

    BirthdayBar(int mes, int dia, List<Integer> lista) {
        this.window = mes;
        this.expectedSum = dia;
        this.list = lista;
        this.listSize = lista.size();
    }

    int countBreakingWays2() {

        int result = 0;
        for (int counter = 0; counter < listSize - window + 1; counter++)
            if (sumWindow(counter) == expectedSum)
                result++;

        return result;
    }

    private int sumWindow(int from) {
        int result = 0;
        for (int i = from; i < from + window && listSize != 0; i++)
            result += list.get(i);

        return result;
    }

    int countBreakingWays() {
        int result = 0;
        int sum = sumWindow(0);
        if (sum == expectedSum)
            result++;

        for (int counter = 1; counter < listSize - window + 1; counter++) {
            sum += list.get(counter + window - 1) - list.get(counter - 1);
            if (sum == expectedSum)
                result++;
        }

        return result;
    }
}
