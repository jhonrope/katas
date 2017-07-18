package org.example.circulararrayrotation;

class CircularArray {
    private final int[] array;
    private final int rotationNumber;
    private final int length;

    CircularArray(int[] array, int rotationNumber) {
        this.array = array;
        this.rotationNumber = rotationNumber;
        length = array.length;
    }

    int get(int index) {
        return array[(index + length - (rotationNumber % length)) % length];
    }
}
