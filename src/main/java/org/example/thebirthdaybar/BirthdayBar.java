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

    int countBreakingWays() {

        int result = 0;
        for (int counter = 0; counter < listSize - window + 1; counter++)
            if (sumWindow(counter) == expectedSum)
                result++;

        return result;
    }

    private int sumWindow(int from) {
        int result = 0;
        for (int i = from; i < from + window; i++)
            result += list.get(i);

        return result;
    }


}
