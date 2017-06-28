package org.example.dayoftheprogrammer;


class DayOfTheProgrammer {
    static String getDay(int year) {
        String day = "13";

        if (isGregorianLeapYear(year) || isJulianLeapYear(year)) {
            day = "12";
        }
        if (isTransitionYear(year)) {
            day = "26";
        }

        return day + ".09." + year;
    }

    private static boolean isTransitionYear(int year) {
        return year == 1918;
    }

    private static boolean isGregorianLeapYear(int year) {
        return year > 1918 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }

    private static boolean isJulianLeapYear(int year) {
        return year < 1918 && (year % 4 == 0);
    }
}
