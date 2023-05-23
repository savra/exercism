package com.hvdbs.savra.exercism.java.lasagna;

public class Lasagna {
    private static final int PREPARATION_TIME = 2;
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int remaining) {
        return expectedMinutesInOven() - remaining;
    }

    public int preparationTimeInMinutes(int layers) {
        return PREPARATION_TIME * layers;
    }

    public int totalTimeInMinutes(int layers, int hasBeenInOven) {
        return preparationTimeInMinutes(layers) + hasBeenInOven;
    }
}
