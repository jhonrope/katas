package org.example.savetheprisoner;


class SaveThePrisoner {

    private final int prisoners;

    SaveThePrisoner(int prisionerNumber) {
        this.prisoners = prisionerNumber;
    }

    int getWarning(int candies, int startingPrisioner) {
        int result = startingPrisioner + candies - 1;
        int modulo = result % prisoners;

        return modulo == 0 ? prisoners : modulo;
    }
}