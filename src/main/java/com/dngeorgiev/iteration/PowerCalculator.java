package com.dngeorgiev.iteration;

public final class PowerCalculator {
    public static final PowerCalculator INSTANCE = new PowerCalculator();

    private PowerCalculator() {
    }

    public int calculate(int base, int exponent) {
        assert exponent >= 0 : "exponent can't be less than 0.";

        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        return result;
    }
}
