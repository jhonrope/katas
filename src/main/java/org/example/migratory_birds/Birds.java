package org.example.migratory_birds;

import java.util.List;

class Birds {
    private final int listSize;
    private final List<Integer> list;

    Birds(List<Integer> list) {
        this.list = list;
        listSize = list.size();
    }

    int findMostCommon() {
        return idMostCommon(countTypes());
    }


    private int[] countTypes() {
        int[] typeCounter = new int[]{0, 0, 0, 0, 0};
        for (int i = 0; i < listSize; i++) {
            typeCounter[list.get(i) - 1] += 1;
        }
        return typeCounter;
    }

    private int idMostCommon(int[] typeCounter) {
        int[] types = new int[]{1, 2, 3, 4, 5};
        int typesSize = types.length;
        int mostCommon = 0;
        int idMostCommon = 1;
        for (int i = 0; i < typesSize; i++) {
            if (typeCounter[i] > mostCommon) {
                mostCommon = typeCounter[i];
                idMostCommon = i + 1;
            }
        }
        return idMostCommon;
    }
}
