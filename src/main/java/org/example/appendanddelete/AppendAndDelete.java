package org.example.appendanddelete;

class AppendAndDelete {
    static String extract(String toBeTransformed, String target, int operations) {
        if (isPossible(toBeTransformed, target, operations)) {
            return "Yes";
        } else {
            return "No";
        }
    }

    private static boolean isPossible(String toBeTransformed, String target, int operations) {
        int targetLength = target.length();
        int toBeTransformedLength = toBeTransformed.length();

        if (toBeTransformedLength + targetLength <= operations)
            return true;

        int minOperation = getMinOperation(toBeTransformed, target, targetLength, toBeTransformedLength);

        if (operations < minOperation)
            return false;

        return (minOperation - operations) % 2 == 0;

    }

    private static int getMinOperation(String toBeTransformed, String target, int targetLength, int toBeTransformedLength) {
        int min = Math.min(toBeTransformedLength, targetLength);

        int commonLetters = getCommonLetters(toBeTransformed, target, min);

        return toBeTransformedLength - commonLetters + targetLength - commonLetters;
    }


    private static int getCommonLetters(String toBeTransformed, String target, int min) {
        int commonLetters = 0;
        for (int i = 0; i < min; i++) {
            if (toBeTransformed.charAt(i) == target.charAt(i)) {
                commonLetters++;
            } else {
                break;
            }
        }
        return commonLetters;
    }

}
